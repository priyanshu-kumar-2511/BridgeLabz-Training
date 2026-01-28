package com.annotations.advancedlevel.rolebasedaccesscontrol;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)   // Restrict specific methods
public @interface RoleAllowed {

    String value();   // Required role
}
