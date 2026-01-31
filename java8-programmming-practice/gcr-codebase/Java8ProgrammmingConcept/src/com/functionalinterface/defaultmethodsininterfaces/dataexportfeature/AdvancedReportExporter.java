package com.functionalinterface.defaultmethodsininterfaces.dataexportfeature;

public class AdvancedReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Advanced CSV Export: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Advanced PDF Export: " + data);
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("Exporting Report to JSON: { \"data\": \"" + data + "\" }");
    }
}
