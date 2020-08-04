import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void testcheckFizzBuzz() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);

    }

    @Test
    void testcheckFizzBuzz1() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);

    }

    @Test
    void testcheckFizzBuzz2() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);

    }

    @Test
    void testcheckFizzBuzz3() {
        int number = 22;
        String expected = "22";

        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected,result);

    }
}