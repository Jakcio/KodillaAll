package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    private

    @Test
    void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(1,2);
        double sub = calculator.sub(1,2);
        double mul = calculator.mul(1,2);
        double div = calculator.div(2,2);
        //Then
        assertEquals(add, 3);
        assertEquals(sub, -1);
        assertEquals(mul, 2);
        assertEquals(div, 1);


    }

}
