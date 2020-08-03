public class Square extends Rectangle implements Colorable {
    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public double getArea() {
        return Math.pow(getWidth(),2);
    }

    @Override
    public String toString() {
        return "Hình vuông có diện tích là: " + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides");;
    }
}
