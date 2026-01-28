package com.annotations.advancedlevel.rolebasedaccesscontrol;

/*5️. Implement a Role-Based Access Control with @RoleAllowed
✅ Problem Statement:
Define a class-level annotation @RoleAllowed to restrict method access based on roles.
🔹 Requirements:
@RoleAllowed("ADMIN") should only allow ADMIN users to execute the method.
Simulate user roles and validate access before invoking the method.
If a non-admin tries to access it, print Access Denied!
*/

import java.lang.reflect.Method;

public class AccessController {

    private static String currentUserRole;

    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        // Simulate different users
        simulateUser("ADMIN", service);
        simulateUser("USER", service);
    }

    private static void simulateUser(String role,
                                     AdminService service)
            throws Exception {

        currentUserRole = role;

        System.out.println("\nCurrent User Role: " + role);

        Method[] methods = AdminService.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed annotation =
                        method.getAnnotation(RoleAllowed.class);

                String requiredRole = annotation.value();

                if (requiredRole.equals(currentUserRole)) {

                    method.invoke(service);

                } else {
                    System.out.println("Access Denied! Cannot execute: "
                            + method.getName());
                }

            } else {
                // No restriction → allow
                method.invoke(service);
            }
        }
    }
}
