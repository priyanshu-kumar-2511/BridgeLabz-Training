package com.multithreading.downloadmanager;

import java.util.Random;

class FileDownloader extends Thread {

    private String fileName;
    private Random random = new Random();

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int progress = 0; progress <= 100; progress += 10) {
            try {
                Thread.sleep(random.nextInt(400) + 100); // 100-500ms delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("[" + Thread.currentThread().getName() + "] Downloading "
                    + fileName + ": " + progress + "%");
        }
    }
}