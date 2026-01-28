package com.reflection.retriveannotationsatruntime;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)   // Must be available at runtime
@Target(ElementType.TYPE)             // Applied to classes
public @interface Author {

    String name();
}
