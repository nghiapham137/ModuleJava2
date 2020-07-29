import java.util.Scanner;

public class temPeratureExchange {
    public static double fahrenheitToCelcius(double farenheit){
        double celcius = (5.0 / 9) * (farenheit - 32);
        return celcius;
    }
    public static double celCiusToFarenheit(double celcius){
        double farenheit = (9.0 / 5) * celcius + 32;
        return farenheit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Ứng dụng chuyển đổi nhiệt độ");
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Hãy nhập lựa chọn");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Nhập độ F muốn chuyển: ");
                    double farenheit = scanner.nextDouble();
                    System.out.println("Độ F sau khi được chuyển thành: " + fahrenheitToCelcius(farenheit) + " độ C");
                    break;
                case 2:
                    System.out.println("Nhập độ C muốn chuyển: ");
                    double celcius = scanner.nextDouble();
                    System.out.println("Độ C sau khi chuyển thành: " + celCiusToFarenheit(celcius) + "độ F");
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
