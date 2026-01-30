package com.lambdaexpressions.notificationfiltering;

public class Alert {

    private String patientName;
    private String type;      // CRITICAL, WARNING, INFO
    private int severity;     // 1–10 scale

    public Alert(String patientName, String type, int severity) {
        this.patientName = patientName;
        this.type = type;
        this.severity = severity;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getType() {
        return type;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "patient='" + patientName + '\'' +
                ", type='" + type + '\'' +
                ", severity=" + severity +
                '}';
    }
}
