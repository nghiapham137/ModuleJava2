package View;


import Entities.Word;
import IO.IOManager;
import Service.Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        String choice;
        Scanner scanner = new Scanner(System.in);
        IOManager ioManager = new IOManager();
        List<Word> list ;
        list = ioManager.readFromFile();
        Method method = new Method(list);

        do {
            System.out.println("Menu");
            System.out.println("1.Search");
            System.out.println("2.Define");
            System.out.println("3.Remove");
            System.out.println("4.Export to file");
            System.out.println("5.Show all");
            System.out.println("0.Save and Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    method.search();
                    break;
                case "2":
                    method.define();
                    break;
                case "3":
                    method.remove();
                    break;
                case "4":
                    method.export();
                    break;
                case "5":
                    method.show();
                    break;
                case "0":
                    ioManager.writeToFile(list);
                    System.exit(0);
                default:
                    System.err.println("This function is not exist");
                    break;
            }
        }while (true);
    }
}
