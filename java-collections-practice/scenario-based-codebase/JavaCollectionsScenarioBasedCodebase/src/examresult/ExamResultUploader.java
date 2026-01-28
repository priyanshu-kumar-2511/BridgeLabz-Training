package examresult;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader<T> {

    private static final Pattern LINE_PATTERN =
            Pattern.compile("^(\\d+),([A-Za-z]+),([A-Za-z]+),(\\d{1,3})$");

    private Map<String, List<Integer>> subjectMarks = new HashMap<>();
    private Map<String, PriorityQueue<StudentRecord>> subjectTopper = new HashMap<>();

    public void processFile(String filePath)
            throws InvalidFormatException {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                Matcher matcher = LINE_PATTERN.matcher(line);

                if (!matcher.matches()) {
                    throw new InvalidFormatException(
                            "Invalid format: " + line);
                }

                String rollNo = matcher.group(1);
                String name = matcher.group(2);
                String subject = matcher.group(3);
                int marks = Integer.parseInt(matcher.group(4));

                if (marks < 0 || marks > 100) {
                    throw new InvalidFormatException(
                            "Invalid marks value: " + line);
                }

                // Store subject-wise marks
                subjectMarks
                        .computeIfAbsent(subject,
                                k -> new ArrayList<>())
                        .add(marks);

                // Maintain top scorer per subject
                subjectTopper
                        .computeIfAbsent(subject,
                                k -> new PriorityQueue<>(
                                        Comparator.comparingInt(
                                                StudentRecord::getMarks)
                                                .reversed()))
                        .add(new StudentRecord(rollNo,
                                name, subject, marks));
            }

        } catch (IOException e) {
            System.out.println("File reading error: " +
                    e.getMessage());
        }
    }

    public void printTopScorers() {

        System.out.println("\nTop Scorers Per Subject:");

        for (String subject : subjectTopper.keySet()) {

            PriorityQueue<StudentRecord> pq =
                    subjectTopper.get(subject);

            if (!pq.isEmpty()) {
                System.out.println(subject + " → "
                        + pq.peek());
            }
        }
    }

    public void printSubjectWiseMarks() {

        System.out.println("\nSubject-wise Marks:");

        for (String subject : subjectMarks.keySet()) {
            System.out.println(subject + " → "
                    + subjectMarks.get(subject));
        }
    }
}
