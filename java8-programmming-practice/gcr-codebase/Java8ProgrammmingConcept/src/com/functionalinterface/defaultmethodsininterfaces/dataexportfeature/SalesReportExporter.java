package com.functionalinterface.defaultmethodsininterfaces.dataexportfeature;

public class SalesReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting Sales Report to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting Sales Report to PDF: " + data);
    }
}
