package com.functionalinterface.markerinterfaces.sensitivedatatagging;

public class EncryptionService {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive object: " + obj);
        } else {
            System.out.println("No encryption required for: " + obj);
        }
    }
}
