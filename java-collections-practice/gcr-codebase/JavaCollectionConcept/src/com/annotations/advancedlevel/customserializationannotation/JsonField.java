package com.annotations.advancedlevel.customserializationannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {

    String name();   // Custom JSON key
}
