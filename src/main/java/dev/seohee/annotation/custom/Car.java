package dev.seohee.annotation.custom;

import dev.seohee.annotation.custom.annotation.ModelDescriptionPrint;
import dev.seohee.annotation.custom.annotation.ModelDescriptionPrints;

public class Car {
    private final String model;
    private final Integer year;

    public Car(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    // print model description
    @ModelDescriptionPrints({
            @ModelDescriptionPrint(model = "Ionic", description = "new model"),
            @ModelDescriptionPrint(model = "Sonata", description = "steady seller"),
            @ModelDescriptionPrint(model = "Grandeur", description = "luxury model"),
            @ModelDescriptionPrint(model = "Avante", description = "compact model"),
            @ModelDescriptionPrint(model = "Morning", description = "small car")
    })
    public String getModel() {
//        if(model.equals("Ionic")) {
//            System.out.println("new model");
//        } else if(model.equals("Sonata")) {
//            System.out.println("steady seller");
//        } else if(model.equals("Grandeur")) {
//            System.out.println("luxury model");
//        } else if(model.equals("Avante")) {
//            System.out.println("compact model");
//        } else if(model.equals("Morning")) {
//            System.out.println("small car");
//        }
        try {
            ModelDescriptionPrint[] annotations = this.getClass().getMethod("getModel").getAnnotationsByType(ModelDescriptionPrint.class);
            for(ModelDescriptionPrint annotation : annotations) {
                if(annotation.model().equals(model)) {
                    System.out.println(annotation.description());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
