package Models;

import java.util.List;

public class DaGiac {
    private int sideNumber;
    private List<Integer> sideLength;

    public DaGiac(int sideNumber, List<Integer> sideLength) {
        this.sideNumber = sideNumber;
        this.sideLength = sideLength;
    }

    public int getSideNumber() {
        return sideNumber;
    }

    public void setSideNumber(int sideNumber) {
        this.sideNumber = sideNumber;
    }

    public List<Integer> getSideLength() {
        return sideLength;
    }

    public void setSideLength(List<Integer> sideLength) {
        this.sideLength = sideLength;
    }

    public void perimeterCalculate(List<Integer> sideLength) {

    }

    public void printSideLengths() {
    }


}
