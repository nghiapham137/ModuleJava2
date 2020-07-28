import java.util.Scanner;

public class appMenu {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true){
        System.out.println("Menu");
        System.out.println("1. Draw a triangle");
        System.out.println("2. Draw a square");
        System.out.println("3. Draw a rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();


        switch (choice){
            case 1:
                System.out.println("Draw a triangle");
                for (int i = 0; i <= 5; i++){
                    for (int j = 5; j > i; j--){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Draw a square");
                for (int i = 0; i < 5; i++){
                    for (int j = 0; j <= 10; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Draw a rectangle");
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j <= 8; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }

     }
    }
}
