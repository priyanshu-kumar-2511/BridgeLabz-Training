package com.multithreading.downloadmanager;

/*Problem 1: Download Manager
User Scenario:
You are developing a download manager application that can download multiple files
simultaneously. Each file download should run in a separate thread.
Requirements:
● Create a FileDownloader class that implements the downloading logic
● Each downloader should simulate downloading by printing progress (0% to 100%)
● Use appropriate thread creation method
● Display which thread is downloading which file
● Add random delay to simulate actual download time
Tasks:
1. Implement using Thread class approach
2. Implement using Runnable interface approach
3. Download 3 files concurrently: “Document.pdf”, “Image.jpg”, “Video.mp4”
4. Display the thread name and current download percentage
5. Ensure main thread waits for all downloads to complete before printing “All downloads
complete”
Expected Output Pattern:
[Thread-1] Downloading Document.pdf: 25%
[Thread-2] Downloading Image.jpg: 15%
[Thread-3] Downloading Video.mp4: 30%
...
All downloads complete!*/

public class DownloadManagerThreadApproach {
	public static void main(String[] args) throws InterruptedException {

        FileDownloader d1 = new FileDownloader("Document.pdf");
        FileDownloader d2 = new FileDownloader("Image.jpg");
        FileDownloader d3 = new FileDownloader("Video.mp4");

        d1.start();
        d2.start();
        d3.start();

        // Main thread waits
        d1.join();
        d2.join();
        d3.join();

        System.out.println("All downloads complete!");
    }	
}
