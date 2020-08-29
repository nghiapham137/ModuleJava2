package Models;

import java.util.List;

public class TamGiac extends DaGiac {
    public TamGiac(int sideNumber, List<Integer> sideLength) {
        super(sideNumber, sideLength);
    }

    @Override
    public void perimeterCalculate(List<Integer> sideLength) {
        int perimeter = 0;
        if (isTriangle(sideLength)) {
            perimeter = sideLength.get(1) + sideLength.get(0) + sideLength.get(2);
            System.out.println("Chu vi hinh nay la: " + perimeter);
        }else System.out.println("Day khong phai la hinh tam giac nen ki tinh dươc chu vi");
    }

    private boolean isTriangle(List<Integer> sideLength) {
        if (sideLength.size() != 3) {
            System.out.println("Day khong phai la hinh tam giac");
            return false;
        } else {
                if (sideLength.get(0) + sideLength.get(1) > sideLength.get(2) &&
                sideLength.get(1) + sideLength.get(2) > sideLength.get(0) &&
                sideLength.get(0) + sideLength.get(2) > sideLength.get(1)) {
                    return true;
                }else return false;
        }
    }

    public void areaCalculate(List<Integer> sideLengths) {
        double p = (sideLengths.get(0) + sideLengths.get(1) + sideLengths.get(2))/2;
        double area = 0;
        if (isTriangle(sideLengths)) {
            area = Math.sqrt(p * (p-sideLengths.get(0))* (p - sideLengths.get(1)) * (p - sideLengths.get(2)));
            System.out.println("Dien tich hinh tam giac la: " + area);
        }else System.out.println("Day khong phai la hinh tam giac");

    }
}
