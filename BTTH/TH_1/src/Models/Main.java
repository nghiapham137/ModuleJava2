package Models;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> side = new ArrayList<>();
        side.add(3);
        side.add(4);
        side.add(5);

        TamGiac tamGiac = new TamGiac(3,side);
        tamGiac.perimeterCalculate(side);

        System.out.println(side.get(0));
        System.out.println(side.get(1));
        System.out.println(side.get(2));
        tamGiac.areaCalculate(side);
    }
}
