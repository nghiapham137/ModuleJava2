import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        System.out.println("Tính chỉ số cân nặng của 1 người");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập số cân nặng: ");
        double weight = scanner.nextDouble();

        System.out.println("Hãy nhập chiều cao: ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height,2);


        if (bmi < 18.5){
            System.out.println(bmi + " Underweight");
        }else if (bmi < 25.0){
            System.out.println(bmi + " Normal");
        }else if (bmi < 30.0){
            System.out.println(bmi + " Overweight");
        }else {
            System.out.println(bmi + " Obese");
        }
    }
}
