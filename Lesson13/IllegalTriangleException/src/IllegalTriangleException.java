import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void checkTriangle(int sidea, int sideb, int sidec) throws IllegalTriangleException {
        if (sidea + sideb > sidec && sideb + sidec > sidea && sidec + sidea > sideb)
            System.out.println("Đây là hình tam giác");
        else throw new IllegalTriangleException();
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a, b, c;
            System.out.println("Nhập cạnh a: ");
            a = scanner.nextInt();
            System.out.println("Nhập cạnh b: ");
            b = scanner.nextInt();
            System.out.println("Nhập cạnh c: ");
            c = scanner.nextInt();
            checkTriangle(a,b,c);
        }
         catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
