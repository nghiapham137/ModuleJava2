import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @org.junit.jupiter.api.Test
    void testFindAbsoluteNumber() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsoluteNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void testFindAbsoluteNumber1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsoluteNumber(number);
        assertEquals(expected,result);
    }

    @Test
    void testFindAbsoluteNagative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
}