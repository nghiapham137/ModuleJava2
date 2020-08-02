public class Triangle extends  Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 =side1;
    }

    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 =side2;
    }

    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 =side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public boolean isTriangle() {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
            return true;
        else return false;
    }

    public double getHeight() {
        double p = this.getPerimeter() / 2;
        return  2 * (Math.sqrt(p * (p - side1)*(p - side2) * (p - side3))/ side1);

    }

    public double getArea() {
        return side1 / 2 * this.getHeight();
    }

    @Override
     public String toString() {
        return "Hình chữ nhật có màu: " + getColor()
                + " có diện tích: " + getArea() + " , có chu vi: " + getPerimeter();
     }

}
