import java.util.Scanner;

public class displayThings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu");
            System.out.println("1. Draw a rectangle");
            System.out.println("2. Draw square triangles");
            System.out.println("3. Draw a isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");


            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Draw a rectangle");
                    for (int i = 0; i < 3; i ++){
                        for (int j = 0; j <= 8; j ++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Draw square triangles");
                    for (int i = 0; i <= 5; i++ ){
                        for (int j = 0; j < i; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }

                    System.out.print("\n");

                    for (int i = 0; i < 5 ; i++) {
                         for (int j = 5; j > i ; j--) {
                            System.out.print("*");
                         }
                        System.out.print("\n");
                    }

                    System.out.print("\n");

                    for (int i = 0; i < 5 ; i++) {
                        for (int j = 0; j < 5  ; j++) {
                            if (j < 5 - 1 - i)
                                System.out.print(" ");
                            else System.out.print("*");
                        }
                        System.out.println("");
                    }

                    System.out.println("");

                    for (int i = 0; i < 5 ; i++) {
                        for (int j = 5; j >= 1 ; j--) {
                            if (j > 5 - i)
                                System.out.print(" ");
                            else System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw a isosceles triangle");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = i; j <= 5 ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
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
