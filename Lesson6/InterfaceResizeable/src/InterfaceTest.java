import java.util.Scanner;

public class InterfaceTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập giá trị muốn thay đổi: ");
        double percent = scanner.nextDouble();
//        System.out.println("Nhập hình cần resize: ");
//        int shapeid = scanner.nextInt();

        for (Shape shapes : shape) {
            if (shapes instanceof Circle ) {
                System.out.println("Diện tích cũ là: " +((Circle) shapes).getArea());
                Resizeable resizeable = (Circle) shapes;
                resizeable.reSize(percent);
                System.out.println("Hình có diện tích mới là: " + ((Circle) shapes).getArea());
            }
        }


    }
}
