package com.generics.resumescreeningsystem;

import java.util.List;

public class ResumeScreeningUtil {

    // Wildcard method
    public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {

        System.out.println("\nAI Screening Results:");

        for (Resume<? extends JobRole> r : resumes) {
            System.out.println(r.getSummary() +
                    (r.isEligible() ? " Shortlisted" : " Rejected"));
        }
    }
}
