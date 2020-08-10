import java.util.EmptyStackException;

public class MyStack {
    private int[] arr;
    private int size ;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        boolean status = false;
        if (index == 0) {
            status = true;
        }
        return status;
    }

    public boolean isFull() {
        boolean status = false;
        if (index == size) {
            status = true;
        }
        return status;
    }

    public int getSize() {
        return index;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[--index];
    }
}
