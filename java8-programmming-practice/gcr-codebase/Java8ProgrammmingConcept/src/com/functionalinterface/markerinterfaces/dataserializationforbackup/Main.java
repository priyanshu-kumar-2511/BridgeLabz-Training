package com.functionalinterface.markerinterfaces.dataserializationforbackup;

/*1. Data Serialization for Backup
○ Scenario: Mark certain classes as Serializable for backup storage.
○ Task: Implement marker interface for backup processing.*/

public class Main {

    public static void main(String[] args) {

        UserData user = new UserData("Ravi", "ravi@gmail.com");
        SessionCache cache = new SessionCache("ABC123");

        BackupProcessor.processBackup(user);
        BackupProcessor.processBackup(cache);
    }
}
