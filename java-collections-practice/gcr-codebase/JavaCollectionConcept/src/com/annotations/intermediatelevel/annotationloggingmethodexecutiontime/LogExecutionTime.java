package com.annotations.intermediatelevel.annotationloggingmethodexecutiontime;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}
