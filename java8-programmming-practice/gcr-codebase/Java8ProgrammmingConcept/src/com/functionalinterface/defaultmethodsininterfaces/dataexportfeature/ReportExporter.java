package com.functionalinterface.defaultmethodsininterfaces.dataexportfeature;

public interface ReportExporter {

    void exportToCSV(String data);

    void exportToPDF(String data);

    // Newly added feature
    default void exportToJSON(String data) {
        System.out.println("JSON export not supported for this exporter.");
    }
}
