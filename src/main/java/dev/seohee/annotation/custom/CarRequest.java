package dev.seohee.annotation.custom;

import dev.seohee.annotation.custom.annotation.YearRange;

public class CarRequest {
    private final String model;
    // 2000 ~ 2025
    @YearRange(min = 2000, max = 2025)
    private final Integer year;

    public CarRequest(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }
}
