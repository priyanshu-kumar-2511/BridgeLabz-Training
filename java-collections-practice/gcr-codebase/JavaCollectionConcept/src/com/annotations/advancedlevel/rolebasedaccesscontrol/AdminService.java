package com.annotations.advancedlevel.rolebasedaccesscontrol;

public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }

    @RoleAllowed("USER")
    public void viewProfile() {
        System.out.println("Profile viewed.");
    }

    public void publicMethod() {
        System.out.println("Public method executed.");
    }
}
