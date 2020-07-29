public class findMinInArray {
    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array = {4,12,7,8,1,6,9};
        int minnum = minValue(array);
        System.out.println("Mảng cho trước là: ");
        for (int i = 0; i < array.length ; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println("Số bé nhất trong mảng đã cho trước là: " + minnum);

    }
}
