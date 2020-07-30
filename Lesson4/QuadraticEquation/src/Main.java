import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập số c:");
        double c = scanner.nextDouble();

        quaDraticEquation quadraticequation = new quaDraticEquation(a,b,c);

        double del = quadraticequation.getDiscriminant();
        System.out.println(quadraticequation.display());
        System.out.println("Delta của phương trình = " + del);
        if (del > 0){
            System.out.printf("Phương trình có 2 nghiệm là: %.2f và %.2f ",quadraticequation.getRoot1(),quadraticequation.getRoot2());
        }else if (del == 0){
            System.out.println("Phương trình có 1 nghiệm kép là: " + quadraticequation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }


    }
}
