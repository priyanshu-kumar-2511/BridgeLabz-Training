package com.functionalinterface.markerinterfaces.dataserializationforbackup;

public class BackupProcessor {

    public static void processBackup(Object obj) {

        if (obj instanceof Backupable) {
            System.out.println("Backing up object: " + obj.toString());
        } else {
            System.out.println("Object not eligible for backup.");
        }
    }
}
