
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Method  m = new Method();
        String choice;
        ProductManagement pm = new ProductManagement();
        pm.readProductFromFile();
        do {
            startApp :
            {
                System.out.println("Menu");
                System.out.println("1. Add");
                System.out.println("2. Update");
                System.out.println("3. Show");
                System.out.println("4. Search");
                System.out.println("5. Delete");
                System.out.println("0. Exit");
                System.out.println("Nhập lựa chọn: ");
                choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        m.add(pm);
                        break ;
                    case "2":
                        m.update(pm);
                        break ;
                    case "3":
                        m.show(pm);
                        break ;
                    case "4":
                        m.search(pm);
                        break ;
                    case "5":
                        m.delete(pm);
                        break ;
                    case "0":
                        pm.writeProductToFile();
                        System.exit(0);
                        break ;
                    default:
                        System.out.println("Ko phải chức năng của chương trình");
                        break startApp;
                }
            }
        }while (true);

    }
}
