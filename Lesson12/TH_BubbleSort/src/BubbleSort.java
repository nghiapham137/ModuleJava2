import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("You input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        System.out.println("\nBegin sort prcessing...");
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 0; i < list.length - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    needNextPass = true;
                }
            }

            if (needNextPass == false) {
                System.out.println("Array maybe sorted and next pass not needed");
                break;
            }

            System.out.println("List after the " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j] + "\t");
            }
            System.out.println();

        }
    }
}
