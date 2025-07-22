package dev.seohee.annotation.custom;

import static org.assertj.core.api.Assertions.assertThat;import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CustomAnnotationMainTest {

    // year 가 2000 ~ 2025 사이인지 test
    @Test
    public void testValidYearRange() {
        Car car = CarFactory.createCar(new CarRequest("BMW", 2021));
        assertThat(car.getYear()).isEqualTo(2021);

        System.out.println(car);
    }

    @Test
    public void testInvalidYearRange() {
//        Car car = CarFactory.createCar(new CarRequest("BMW", 2026));
//        System.out.println(car);
        assertThatThrownBy(() ->
                CarFactory.createCar(new CarRequest("BMW", 2026)))
                .isInstanceOf(IllegalArgumentException.class);
    }

}