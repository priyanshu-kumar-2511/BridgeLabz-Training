package resumeanalyzer;

/*1. ResumeAnalyzer – Smart Resume Filtering System
Story: At HireRight Technologies, HRs receive hundreds of resumes daily. An automated
system called ResumeAnalyzer is being developed to process .txt and .pdf resumes stored
in a folder.
The goal is to read each resume (using I/O Streams), extract contact details (email, phone)
using Regex, and index them into a Map<String, ResumeData>, where the key is the
candidate's email.
The system should support:
● Reading resumes from a folder
● Extracting keywords (Java, Python, Spring) using regex
● Storing candidates in a list sorted by keyword match count
● Skipping resumes with invalid formats using exception handling*/

import java.util.List;

public class ResumeData {

    private String email;
    private String phone;
    private List<String> matchedKeywords;
    private int matchCount;

    public ResumeData(String email, String phone, List<String> matchedKeywords) {
        this.email = email;
        this.phone = phone;
        this.matchedKeywords = matchedKeywords;
        this.matchCount = matchedKeywords.size();
    }

    public String getEmail() {
        return email;
    }

    public int getMatchCount() {
        return matchCount;
    }

    @Override
    public String toString() {
        return "Email: " + email +
                ", Phone: " + phone +
                ", Keywords: " + matchedKeywords +
                ", MatchCount: " + matchCount;
    }
}
