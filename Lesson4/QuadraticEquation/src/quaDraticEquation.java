public class quaDraticEquation {
    double a,b,c;

    public quaDraticEquation(){

    }

    public quaDraticEquation(double a, double b, double c) {
        this.a  = a;
        this.b = b;
        this.c = c;
    }

//    public double getA() {
//        return this.a;
//    }
//
//    public double getB() {
//        return this.b;
//    }
//    public double getC() {
//        return this.c;
//    }

    public double getDiscriminant() {
        double delta = this.b * 2 - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c))/ 2 * this.a;
        return r1;
    }

    public double getRoot2() {
        double r2 =  (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c))/ 2 * this.a;
        return r2;
    }

    public String display() {
        return "Phương trình bậc 2 có 3 tham số: " + a + " " + b + " " + c;
    }


}
