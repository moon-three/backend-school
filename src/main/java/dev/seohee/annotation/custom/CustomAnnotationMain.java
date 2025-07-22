package dev.seohee.annotation.custom;

import dev.seohee.annotation.custom.validator.Validator;

public class CustomAnnotationMain {
    public static void main(String[] args) {
        CarRequest carRequest = new CarRequest("BMW", 2021);

        Car car= CarFactory.createCar(carRequest);

        System.out.println(car);
    }
}
