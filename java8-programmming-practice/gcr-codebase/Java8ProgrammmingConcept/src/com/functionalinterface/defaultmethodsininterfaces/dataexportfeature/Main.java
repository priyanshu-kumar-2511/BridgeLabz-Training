package com.functionalinterface.defaultmethodsininterfaces.dataexportfeature;

/*2. Data Export Feature
○ Scenario: A reporting module can export in CSV and PDF. Later, JSON support
was added.
○ Task: Add a default method exportToJSON() to avoid code changes in all
implementers.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ReportExporter> exporters = Arrays.asList(
                new SalesReportExporter(),
                new AdvancedReportExporter()
        );

        for (ReportExporter exporter : exporters) {
            exporter.exportToCSV("Report Data");
            exporter.exportToPDF("Report Data");
            exporter.exportToJSON("Report Data");
            System.out.println();
        }
    }
}
