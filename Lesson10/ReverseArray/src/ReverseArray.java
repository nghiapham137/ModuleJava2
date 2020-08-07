import java.util.ArrayList;
import java.util.EmptyStackException;

public class ReverseArray<E> {
    private ArrayList<E> stack;


    public ReverseArray() {
        stack = new ArrayList<>();
    }

    public void push(E element) {
        stack.add(element);
    }

    public E pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }else {
            return stack.remove(stack.size()-1);
            }
        }

    public void reverse() {
        ArrayList<E> temp = new ArrayList<>();
        int N = stack.size();
        for (int i = 0; i < N; i++) {
            temp.add(this.pop());
        }
        stack = temp;
    }

    public void print() {
        for (E e : stack)
            System.out.print(e + " ");
    }

}
