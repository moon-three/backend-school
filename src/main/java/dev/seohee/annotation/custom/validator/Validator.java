package dev.seohee.annotation.custom.validator;

import dev.seohee.annotation.custom.CarRequest;
import dev.seohee.annotation.custom.annotation.YearRange;

import java.lang.reflect.Field;

public class Validator {
    public static void validateYear(CarRequest  request) {
        try {
            Field field = request.getClass().getDeclaredField("year");
            field.setAccessible(true);
            YearRange yr = field.getAnnotation(YearRange.class);
            int year = request.getYear();

            if(year < yr.min() || year > yr.max()) {
                throw new IllegalArgumentException("Invalid year range");
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("No such field!");
        }
    }
}
