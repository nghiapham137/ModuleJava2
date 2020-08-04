import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void testclassifyTriangle() {
        int sidea = 2;
        int sideb = 2;
        int sidec = 2;

        String expected = "Tam giác đều";

        String result = TriangleClassifier.classifyTriangle(sidea,sideb,sidec);
        assertEquals(expected,result);
    }

    @Test
    void testclassifyTriangle1() {
        int sidea = 2;
        int sideb = 2;
        int sidec = 3;

        String expected = "Tam giác cân";

        String result = TriangleClassifier.classifyTriangle(sidea,sideb,sidec);
        assertEquals(expected,result);
    }

    @Test
    void testclassifyTriangle2() {
        int sidea = 3;
        int sideb = 4;
        int sidec = 5;

        String expected = "Tam giác thường";

        String result = TriangleClassifier.classifyTriangle(sidea,sideb,sidec);
        assertEquals(expected,result);
    }

    @Test
    void testclassifyTriangle3() {
        int sidea = 8;
        int sideb = 2;
        int sidec = 3;

        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.classifyTriangle(sidea,sideb,sidec);
        assertEquals(expected,result);
    }

    @Test
    void testclassifyTriangle4() {
        int sidea = -1;
        int sideb = 2;
        int sidec = 1;

        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.classifyTriangle(sidea,sideb,sidec);
        assertEquals(expected,result);
    }

    @Test
    void testclassifyTriangle5() {
        int sidea = 0;
        int sideb = 1;
        int sidec = 1;

        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.classifyTriangle(sidea,sideb,sidec);
        assertEquals(expected,result);
    }
}