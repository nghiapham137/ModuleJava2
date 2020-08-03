public class Circle {
    private String color = "red";
    private boolean filled = true;
    private double radius = 1;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Hình tròn có màu: " + getColor()
                + " trạng thái: " + (isFilled()? "is filled":"is not filled")
                + " bán kính: " + getRadius();
    }
}
