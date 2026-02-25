package griffith;
//Zeyuan Mi
//3184481

import static org.junit.jupiter.api.Assertions.*;

public class ConversionsTest {
    private final Conversions conversions = new Conversions();
    private static final double ExchangeRate = 1.08;

    @org.junit.jupiter.api.Test
    void testEuroToDollar() {
        assertEquals(108.0,conversions.euroToDollar(100.0));
        assertEquals(-108.0,conversions.euroToDollar(-100.0));
        assertEquals(0.0,conversions.euroToDollar(0.0));



    }

    @org.junit.jupiter.api.Test
    void testDollarToEuro() {
        assertEquals(100.0,conversions.dollarToEuro(108.0));
        assertEquals(-100.0,conversions.dollarToEuro(-108.0));
        assertEquals(0.0,conversions.dollarToEuro(0.0));


    }

    @org.junit.jupiter.api.Test
    void testStringToInteger() {
        assertEquals(123,conversions.stringToInteger("123"));
        assertEquals(-123,conversions.stringToInteger("-123"));
        assertEquals(0,conversions.stringToInteger("0"));
    }

    @org.junit.jupiter.api.Test
    void testIntegerToString() {
        assertEquals("123",conversions.integerToString(123));
        assertEquals("-123",conversions.integerToString(-123));
        assertEquals("0",conversions.integerToString(0));


    }

    @org.junit.jupiter.api.Test
    /*
    This method is used to verify that the case of characters in the string has been switched correctly.
    Test boundary cases and exception handling simultaneously.
     */
    void testSwitchCase() {
        assertEquals("pUSH uP",conversions.switchCase("Push Up"));
        assertEquals("784972QWErty",conversions.switchCase("784972qweRTY"));
        assertEquals("",conversions.switchCase(""));
        assertThrows(NullPointerException.class,()->conversions.switchCase(null));
    }
}