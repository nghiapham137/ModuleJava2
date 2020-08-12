import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length ; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                System.out.println("Swap " + array[j] + " with " + array[j + 1]);
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {5,3,1,2,8,7};
        System.out.println("Mảng cho trước: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Mảng sau khi sort: ");
        insertionSort(array);
    }
}
