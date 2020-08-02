import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1,side2,side3;
        String color;

        System.out.println("Hãy nhập màu cho hình: ");
        color = scanner.nextLine();
        System.out.println("Hẫy nhập cạnh a: ");
        side1 = scanner.nextDouble();
        System.out.println("Hẫy nhập cạnh b: ");
        side2 = scanner.nextDouble();
        System.out.println("Hẫy nhập cạnh c: ");
        side3 = scanner.nextDouble();


        Triangle triangle = new Triangle(color, side1, side2,side3);
        if (triangle.isTriangle()){
            System.out.println(triangle.toString());
        }else {
            System.out.println("Đây ko phải là 3 cạnh của 1 hình chữ nhật");
        }

    }
}
