package dk.kea.junitdemospring.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        //arrange
        //initialiser calculator
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        //act
        int result = calculator.add(2,2);

        //assert
        assertEquals(4, result);
    }

    @Test
    void add2() {
        //act
        int result = calculator.add(17, 25);

        //assert
        assertEquals(42, result);

    }
}