public class Test {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(3,3);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
