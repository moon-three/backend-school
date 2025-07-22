package dev.seohee.annotation.custom.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ModelDescriptionPrints {
    ModelDescriptionPrint[] value();
}
