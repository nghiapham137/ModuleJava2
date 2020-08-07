public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enQueque(14);
        queue.enQueque(22);
//        queue.enQueque(6);
        queue.display();
        System.out.println();
        queue.deQueue();
//        queue.deQueue();
//        queue.enQueque(6);
        queue.display();
    }
}
