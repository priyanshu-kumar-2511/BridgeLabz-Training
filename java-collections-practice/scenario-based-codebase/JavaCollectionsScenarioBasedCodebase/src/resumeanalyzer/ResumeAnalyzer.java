package resumeanalyzer;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ResumeAnalyzer {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("\\b[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\b");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b\\d{10}\\b");

    private static final Pattern KEYWORD_PATTERN =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {

        String folderPath = "resumes"; // Folder containing resumes

        Map<String, ResumeData> resumeMap = new HashMap<>();

        try {
            Files.list(Paths.get(folderPath))
                    .filter(path -> path.toString().endsWith(".txt")
                            || path.toString().endsWith(".pdf"))
                    .forEach(path -> processFile(path, resumeMap));

        } catch (IOException e) {
            System.out.println("Error reading folder: " + e.getMessage());
            return;
        }

        // Sort by keyword match count (descending)
        List<ResumeData> sortedList = new ArrayList<>(resumeMap.values());

        sortedList.sort((r1, r2) ->
                Integer.compare(r2.getMatchCount(), r1.getMatchCount()));

        System.out.println("\n===== Sorted Candidates by Keyword Match =====\n");

        sortedList.forEach(System.out::println);
    }

    private static void processFile(Path path,
                                    Map<String, ResumeData> resumeMap) {

        try {

            String content = readFileContent(path);

            String email = extractFirstMatch(content, EMAIL_PATTERN);
            String phone = extractFirstMatch(content, PHONE_PATTERN);

            if (email == null || phone == null) {
                throw new IllegalArgumentException("Missing contact details");
            }

            List<String> matchedKeywords = extractKeywords(content);

            ResumeData resume =
                    new ResumeData(email, phone, matchedKeywords);

            resumeMap.put(email, resume);

            System.out.println("Processed: " + path.getFileName());

        } catch (Exception e) {
            System.out.println("Skipping invalid resume: "
                    + path.getFileName());
        }
    }

    private static String readFileContent(Path path) throws IOException {

        if (path.toString().endsWith(".txt")) {
            return Files.readString(path);
        }

        else if (path.toString().endsWith(".pdf")) {

            try (PDDocument document = PDDocument.load(path.toFile())) {
                PDFTextStripper stripper = new PDFTextStripper();
                return stripper.getText(document);
            }
        }

        throw new IllegalArgumentException("Unsupported file format");
    }

    private static String extractFirstMatch(String text,
                                            Pattern pattern) {

        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    private static List<String> extractKeywords(String text) {

        Matcher matcher = KEYWORD_PATTERN.matcher(text);
        List<String> keywords = new ArrayList<>();

        while (matcher.find()) {
            keywords.add(matcher.group());
        }

        return keywords;
    }
}
