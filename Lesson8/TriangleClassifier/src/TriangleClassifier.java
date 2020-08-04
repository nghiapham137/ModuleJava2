public class TriangleClassifier {
    public static String classifyTriangle(int sidea, int sideb, int sidec) {
        String result = "";
        if (isTriangle(sidea,sideb,sidec)) {
            if (isIsoscelesTriangle(sidea,sideb,sidec)) {
                if (isEquilateralTriangle(sidea,sideb,sidec))
                    result = "Tam giác đều";
                else result = "Tam giác cân";
            }else result = "Tam giác thường";
        }else result = "Không phải là tam giác";
        return result;
    }

    private static boolean isTriangle(int sidea, int sideb, int sidec) {
        boolean isTriangle = false;
        if (sidea + sideb > sidec &&
        sideb + sidec > sidea &&
        sidea + sidec > sideb) {
            isTriangle = true;
        }else isTriangle = false;
        return isTriangle;
    }
    private static boolean isIsoscelesTriangle(int sidea, int sideb, int sidec) {
        boolean isIsosceles = false;
        if (sidea == sideb || sideb == sidec || sidec == sidea)
            isIsosceles = true;
        else isIsosceles = false;
        return isIsosceles;
    }

    private static boolean isEquilateralTriangle(int sidea, int sideb, int sidec) {
        boolean isEquilateral = false;
        if (sidea == sideb && sideb == sidec && sidec == sidea)
            isEquilateral = true;
        else isEquilateral = false;
        return isEquilateral;
    }
}
