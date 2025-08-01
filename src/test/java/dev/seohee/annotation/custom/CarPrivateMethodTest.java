package dev.seohee.annotation.custom;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarPrivateMethodTest {
    @Test
    public void needMaintenance() throws Exception {
        int yearMaintenance = LocalDate.now().getYear() - 6;
        Car carMaintenance = new Car("TestModel", yearMaintenance);

        Method method = Car.class.getDeclaredMethod("isNeedMaintenance");
        method.setAccessible(true);
        boolean resultMaintenance = (boolean) method.invoke(carMaintenance);

        assertThat(resultMaintenance).isTrue();
    }

    @Test
    public void notNeedMaintenance() throws Exception {
        int yearMaintenance = LocalDate.now().getYear() - 4;
        Car carMaintenance = new Car("TestModel", yearMaintenance);

        Method method = Car.class.getDeclaredMethod("isNeedMaintenance");
        method.setAccessible(true);
        boolean resultMaintenance = (boolean) method.invoke(carMaintenance);

        assertThat(resultMaintenance).isFalse();
    }

    @Test
    public void needChangeOil() {
        int yearChangeOil = LocalDate.now().getYear() - 1;
        Car carChangOil = new Car("TestModel", yearChangeOil);

        boolean resultChangeOil = carChangOil.isNeedChangeOil();

        assertThat(resultChangeOil).isTrue();
    }

    @Test
    public void notNeedChangeOil() {
        int yearChangeOil = LocalDate.now().getYear();
        Car carChangeOil = new Car("TestModel", yearChangeOil);

        boolean resultChangeOil = carChangeOil.isNeedChangeOil();

        assertThat(resultChangeOil).isFalse();
    }




}

