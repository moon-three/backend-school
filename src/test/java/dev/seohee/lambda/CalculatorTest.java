package dev.seohee.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator= new Calculator(10, 20);
        int result = calculator.calculate(
                new Operate() {
                    @Override
                    public int operate(int a, int b) {
                        return a + b;
                    }
                }
        );

        System.out.println(result);
    }

    @Test
    void testAddLambda() {
        Calculator calculator = new Calculator(15, 20);
        int result = calculator.calculate((int a, int b) -> a + b);

        System.out.println(result);
    }

    @Test
    void testAddLambda2() {
        Calculator calculator = new Calculator(10, 30);
        Operate operate = (int a, int b) -> a + b;
        int result = calculator.calculate(operate);

        System.out.println(result);
    }

    @Test
    void testAddLambda3() {
        Calculator calculator = new Calculator(10 ,50);
        int result = calculator.calculate(Integer::sum);

        System.out.println(result);
    }

    @Test
    void testAddLambda4() {
        Calculator calculator = new Calculator(10, 60);
        int result = calculator.calculate(getOperate());

        System.out.println(result);
    }

    private Operate getOperate() {
        return Integer::sum;
    }

    @Test
    void testSubstract() {
        Calculator calculator = new Calculator(20, 10);
        int result = calculator.calculate((int a, int b) -> a - b);

        System.out.println(result);
    }
}