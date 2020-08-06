public class GenericStackClient {
   private static void stackOfIStrings() {
       MyGenericStack<String> stack = new MyGenericStack<>();
       stack.push("Five");
       stack.push("Four");
       stack.push("Three");
       stack.push("Two");
       stack.push("One");
       System.out.println("1.1 Size of stack after push operations: " + stack.size());
       System.out.println("1.2 Pop elements from stack: ");
       while (!stack.isEmpty()) {
           System.out.printf("%s",stack.pop());
       }
       System.out.println("\n1.3 Size of stack after pop: " + stack.size());
   }

    public static void main(String[] args) {
        System.out.println("1. Stack of Strings");
        stackOfIStrings();
    }

}
