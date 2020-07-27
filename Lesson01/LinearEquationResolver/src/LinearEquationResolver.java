import java.util.Scanner;

    public class LinearEquationResolver {
        public static void main(String[] args) {
            System.out.println("LinearEquationResolver");
            System.out.println("Tính giá trị phương trình bậc nhất: a*x + b = c");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập a: ");
            double a = scanner.nextDouble();

            System.out.println("Nhập b: ");
            double b = scanner.nextDouble();

            System.out.println("Nhập c: ");
            double c = scanner.nextDouble();

            if (a != 0) {
                double solution = (c - b) / a;
                System.out.printf("Phương trình có nghiệm là: %f!", solution);
            } else {
                if (b == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        }
    }


