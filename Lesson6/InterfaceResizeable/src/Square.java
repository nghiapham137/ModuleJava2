public class Square extends Rectangle implements Resizeable {
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
        return "A Square with side = "
                + getSide()
                + " ,which is a subclass of "
                + super.toString();
    }

    @Override
    public void reSize(double percent) {
        this.setSide(this.getWidth() * percent);
    }
}

