package griffith;

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
        assertEquals(108.0,conversions.dollarToEuro());
        assertEquals(-108.0,conversions.dollarToEuro());
        assertEquals(0.0,conversions.dollarToEuro());


    }

    @org.junit.jupiter.api.Test
    void stringToInteger() {
    }

    @org.junit.jupiter.api.Test
    void integerToString() {
    }

    @org.junit.jupiter.api.Test
    void switchCase() {
    }
}