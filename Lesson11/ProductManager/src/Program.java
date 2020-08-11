import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ProductManager pm = new ProductManager();
        String choice;
        do {
            startApp :
            {

                System.out.println(" Product Manager");
                System.out.println("Menu");
                System.out.println("1. Add");
                System.out.println("2. Remove");
                System.out.println("3. Edit");
                System.out.println("4. get All");
                System.out.println("0. Exit");
                System.out.println("Nhập lựa chọn: ");
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Nhập id: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập tên: ");
                        String name = scanner.nextLine();
                        System.out.println("Nhập giá: ");
                        float price = Float.parseFloat(scanner.nextLine());
                        pm.add(new Product(id, name, price));
                        break;
                    case "2":
                        System.out.println("Nhập id: ");
                        int id1 = Integer.parseInt(scanner.nextLine());
                        pm.delete(id1);
                        break;
                    case "3":
                        System.out.println("Nhập id: ");
                        int id2 = Integer.parseInt(scanner.nextLine());
                        pm.update(id2);
                        break;
                    case "4":
                        pm.getAll();
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        break startApp;
                }
            }
        }while (true);

    }
}
