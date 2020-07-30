public class quaDraticEquation {
    double a,b,c,delta,r1,r2;

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
        this.delta = Math.pow(this.b,2) - 4 * this.a * this.c;
        return this.delta;
    }

    public double getRoot1() {
        this.r1 = (-this.b + Math.sqrt(delta))/ 2 * this.a;
        return this.r1;
    }

    public double getRoot2() {
        this.r2 =  (-this.b - Math.sqrt(delta))/ 2 * this.a;
        return this.r2;
    }

    public String display() {
        return "Phương trình bậc 2 có 3 tham số: " + a + " " + b + " " + c;
    }


}
