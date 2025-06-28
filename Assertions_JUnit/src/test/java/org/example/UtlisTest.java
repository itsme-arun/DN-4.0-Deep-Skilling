package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtlisTest {

    MathUtils math = new MathUtils();

    @Test
    void testAdd(){
        assertEquals(10, math.add(7, 3), "7 + 3 should equals 10");
        assertNotEquals(11, math.add(7, 3), "7 + 3 should not equals 11");
    }

    @Test
    void testDivide(){
        assertEquals(5, math.div(10, 2), "10/2 should equals 5");

        assertThrows(ArithmeticException.class, () -> math.div(1, 0),"Division by zero throws Exception");
    }

    @Test
    void testGreeting(){
        assertEquals("Hello Arun", math.greetings("Arun"));
        assertNull(math.greetings(null));
        assertNotNull(math.greetings("Cognizant"));
    }

    @Test
    void testGroup(){
        assertAll("Grouped Assertion",
                () -> assertEquals(7, math.add(2, 5)),
                () -> assertTrue(math.add(1, 1) == 2),
                () -> assertFalse(math.add(1, 1) == 3)

        );
    }

}
