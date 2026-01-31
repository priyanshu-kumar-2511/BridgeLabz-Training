package com.functionalinterface.markerinterfaces.dataserializationforbackup;

import java.io.Serializable;

public class UserData implements Backupable, Serializable {

    private String username;
    private String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
