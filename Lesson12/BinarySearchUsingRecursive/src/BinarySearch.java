import java.util.Scanner;

public class BinarySearch {
    public int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr,left,mid - 1, x);

            if (arr[mid] < x)
                return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int arr[] = {2,5,9,15,27,32,46};
        int n = arr.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mảng cho trước: ");
        for (int arrs : arr) {
            System.out.print(arrs + " ");
        }
        System.out.println();
        System.out.println("Nhập số cần tìm: ");
        int x = Integer.parseInt(scanner.nextLine());
        int index = search.binarySearch(arr,0,n -1,x);
        if (index == -1)
            System.out.println("Không tìm thấy phần tử: " + x);
        else
            System.out.println("Phần tử " + x + " được tìm thấy tại chỉ số: " + index);
    }
}
