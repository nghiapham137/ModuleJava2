import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCaculatorTest {

    @org.junit.jupiter.api.Test
    void testFindNextDay() {
        int day = 1;
        int month = 1;
        int year = 2000;
        int[] expected = {2000,1,2};

        int[] result = NextDayCaculator.findNextDay(day,month,year);
        for (int i = 0; i < 3 ; i++) {
            assertEquals(expected[i],result[i]);
        }

    }

    @Test
    void testFindNextDay1() {
        int day = 31;
        int month = 12;
        int year = 2018;

        int[] expected = {2019,1,1};
        int[] result = NextDayCaculator.findNextDay(day,month,year);
        for (int i = 0; i < 3 ; i++) {
            assertEquals(expected[i],result[i]);
        }
    }

    @Test
    void testFindNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;

        int[] expected = {2018,2,1};
        int[] result = NextDayCaculator.findNextDay(day,month,year);
        for (int i = 0; i < 3 ; i++) {
            assertEquals(expected[i],result[i]);
        }
    }

    @Test
    void testFindNextDay3() {
        int day = 29;
        int month = 2;
        int year = 2020;

        int[] expected = {2020,3,1};
        int[] result = NextDayCaculator.findNextDay(day,month,year);
        for (int i = 0; i < 3 ; i++) {
            assertEquals(expected[i],result[i]);
        }
    }

    @Test
    void testFindNextDay4() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int[] expected = {2018,5,1};

        int[] result = NextDayCaculator.findNextDay(day,month,year);
        for (int i = 0; i < 3 ; i++) {
            assertEquals(expected[i],result[i]);
        }

    }

    @Test
    void testFindNextDay5() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int[] expected = {2018,3,1};

        int[] result = NextDayCaculator.findNextDay(day,month,year);
        for (int i = 0; i < 3 ; i++) {
            assertEquals(expected[i],result[i]);
        }

    }
}