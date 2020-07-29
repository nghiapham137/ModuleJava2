
import java.util.Scanner;

public class findMaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập kích thước mảng: ");
        size = scanner.nextInt();

        if (size > 20)
            System.out.println("Đã quá kích thước tôi đa");
        else {
            array = new int[size];
            int i = 0;
            while (i < array.length){
                System.out.println("Nhập phần tử thứ: " + (i + 1) + " : ");
               array[i] = scanner.nextInt();
               i++;
            }

            System.out.println("Danh sách tài sản đã nhập: ");
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println("");

            int max = array[0];
            int index = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max){
                    max = array[j];
                    index = j + 1;
                }
            }
            System.out.println("Số tài sản lớn nhất là: " + max + " tỉ đô,tại vị trí: " + index);
        }
    }
}
