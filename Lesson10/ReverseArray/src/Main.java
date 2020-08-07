import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ReverseArray<Integer> stack = new ReverseArray<>();
        Integer[] a = {1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }
        stack.print();
        System.out.println();
        stack.reverse();
        stack.print();
    }
}
