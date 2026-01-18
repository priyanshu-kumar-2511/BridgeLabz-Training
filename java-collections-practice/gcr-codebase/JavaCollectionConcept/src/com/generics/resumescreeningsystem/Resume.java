package com.generics.resumescreeningsystem;

public class Resume<T extends JobRole> {

    private String candidateName;
    private int experience;
    private T jobRole;

    public Resume(String candidateName, int experience, T jobRole) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.jobRole = jobRole;
    }

    public boolean isEligible() {
        return experience >= jobRole.getMinExperience();
    }

    public String getSummary() {
        return "Candidate: " + candidateName + " | Role: " + jobRole.getRoleName() + " | Experience: " + experience + " yrs";
    }

    public T getJobRole() {
        return jobRole;
    }
}
