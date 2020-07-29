import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range;
        int[] array;

        System.out.println("Nhập vào kích thước mảng: ");
        range = scanner.nextInt();
        if (range > 20)
            System.out.println("Đã quá kích thước tối đa");
        else {
            array = new int[range];
            int i = 0;
            while (i < array.length){
                System.out.println("Nhập giá trị cho phần tử  " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                i++;
            }

            System.out.println("Mảng đã nhập là: ");
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[j] + "\t");
            }

            System.out.println("");

            for (int j = 0; j < array.length / 2 ; j++) {
                int temp = array[j];
                array[j] = array[range - 1 - j];
                array[range - 1 - j] = temp;
            }

            System.out.println("Mảng sau khi đảo ngược: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }



    }
}
