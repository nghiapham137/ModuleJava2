import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class deleteElementInArray {


    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số cần xóa: ");
        int num = scanner.nextInt();


        for (int i = 0; i < array.length ; i++) {
            if (array[i] == num){
                for (int j = i; j < array.length - 1 ; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
            }
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
