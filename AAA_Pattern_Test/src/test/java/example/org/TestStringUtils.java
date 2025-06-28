package example.org;

import org.example.StringUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestStringUtils {

    StringUtils stringUtils;

    @BeforeAll
    void beforeAll() {
        System.out.println("Before All Tests");
    }

    @AfterAll
    void afterAll() {
        System.out.println("After All Tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each Test");
        stringUtils = new StringUtils(); 
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each Test");
    }

    @Test
    void testReverse() {
    
        String result = stringUtils.reverse("Arun");

    
        assertEquals("nurA", result);
    }

    @Test
    void testPalindromeTrue() {
        String input = "madam";
        assertTrue(stringUtils.isPalindrome(input));
    }

    @Test
    void testPalindromeFalse() {
        String input = "arun";
        assertFalse(stringUtils.isPalindrome(input));
    }

    @Test
    void testNullHandling() {
        assertNull(stringUtils.reverse(null));
        assertFalse(stringUtils.isPalindrome(null));
    }
}
