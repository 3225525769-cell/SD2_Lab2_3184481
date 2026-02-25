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
    void switchCase() {
        assertEquals("hELLO wORLD",conversions.switchCase("Hello World"));
        assertEquals("784972QWErty",conversions.switchCase("784972qweRTY"));
        assertEquals("",conversions.switchCase(""));
        assertThrows(NullPointerException.class,()->conversions.switchCase(null));
    }
}