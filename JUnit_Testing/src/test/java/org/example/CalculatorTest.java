package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction(){
        Calculator calc = new Calculator();
        assertEquals(1, calc.sub(3, 2), "3 - 2 should equal 1");
    }

    @Test
    void testMultiplication(){
        Calculator calc = new Calculator();
        assertEquals(15, calc.mul(3, 5), "3 * 5 should equal 15");
    }

    @Test
    void testDivision(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.div(10, 2), "10 / 2 should equal 5");
    }
}
