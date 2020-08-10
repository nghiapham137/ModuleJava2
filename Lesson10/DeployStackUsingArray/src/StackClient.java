public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size after push: " + stack.getSize());
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println("2. Size after pop: " + stack.getSize());
    }
}
