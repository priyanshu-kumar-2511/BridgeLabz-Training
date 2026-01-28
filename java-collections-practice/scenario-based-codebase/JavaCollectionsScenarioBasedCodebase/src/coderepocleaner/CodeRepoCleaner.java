package coderepocleaner;

/*4. CodeRepoCleaner – Java File Scanner and Organizer
Story: In a developer team, thousands of Java source files are dumped into a shared folder.
Over time, many have become redundant, duplicate, or poorly formatted.
The tool CodeRepoCleaner should:
● Scan all .java files in nested folders using I/O
● Use regex to detect:
○ Methods not following naming conventions
○ Unused import statements
● Categorize files into folders (Valid, Warnings, Errors)
● Use List<Path>, Map<FileType, List<File>>, and Set<String> to manage file types
● Allow filtering files based on size, date modified, etc. using streams*/

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    private static final Pattern METHOD_PATTERN =
            Pattern.compile("\\b(public|private|protected)?\\s+\\w+\\s+(\\w+)\\s*\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("import\\s+([\\w\\.\\*]+);");

    public static void main(String[] args) throws IOException {

        String rootFolder = "sourcefolder";

        // Scan all .java files recursively
        List<Path> javaFiles = Files.walk(Paths.get(rootFolder))
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        // Optional filtering using streams
        javaFiles = filterBySize(javaFiles, 0, 500_000);

        Map<FileType, List<File>> categorized = new HashMap<>();
        categorized.put(FileType.VALID, new ArrayList<>());
        categorized.put(FileType.WARNING, new ArrayList<>());
        categorized.put(FileType.ERROR, new ArrayList<>());

        for (Path path : javaFiles) {
            analyzeFile(path, categorized);
        }

        printSummary(categorized);
    }

    // Filter by file size

    private static List<Path> filterBySize(List<Path> files, long minBytes, long maxBytes) {

        return files.stream()
                .filter(p -> {
                    try {
                        long size = Files.size(p);
                        return size >= minBytes && size <= maxBytes;
                    } catch (IOException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

    // Analyze individual file

    private static void analyzeFile(Path path,
                                    Map<FileType, List<File>> categorized) {

        try {

            String content = Files.readString(path);

            boolean hasError = false;
            boolean hasWarning = false;

            // 1️. Method Naming Convention (camelCase expected)
            Matcher methodMatcher = METHOD_PATTERN.matcher(content);

            while (methodMatcher.find()) {

                String methodName = methodMatcher.group(2);

                if (!methodName.matches("^[a-z][a-zA-Z0-9]*$")) {
                    hasWarning = true;
                }
            }

            // 2️. Detect Unused Imports
            Set<String> imports = extractImports(content);

            for (String imp : imports) {
                String simpleName =
                        imp.substring(imp.lastIndexOf('.') + 1);

                if (!content.contains(simpleName)) {
                    hasWarning = true;
                }
            }

            // Categorize
            if (hasError) {
                categorized.get(FileType.ERROR).add(path.toFile());
            }
            else if (hasWarning) {
                categorized.get(FileType.WARNING).add(path.toFile());
            }
            else {
                categorized.get(FileType.VALID).add(path.toFile());
            }

        } catch (IOException e) {
            categorized.get(FileType.ERROR).add(path.toFile());
        }
    }

    // Extract imports

    private static Set<String> extractImports(String content) {

        Set<String> importSet = new HashSet<>();

        Matcher matcher = IMPORT_PATTERN.matcher(content);

        while (matcher.find()) {
            importSet.add(matcher.group(1));
        }

        return importSet;
    }

    // Print Summary

    private static void printSummary(
            Map<FileType, List<File>> categorized) {

        System.out.println("\n===== CodeRepoCleaner Report =====");

        for (FileType type : categorized.keySet()) {

            System.out.println("\n" + type + ":");

            for (File file : categorized.get(type)) {
                System.out.println(" - " + file.getName());
            }
        }
    }
}
