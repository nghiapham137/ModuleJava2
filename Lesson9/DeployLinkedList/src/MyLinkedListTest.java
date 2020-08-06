public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> mylist = new MyLinkedList<>();
        mylist.addFirst(1);
        mylist.addFirst(2);
        mylist.addFirst(3);
        mylist.addFirst(4);
        mylist.addLast(7);
        mylist.addFirst(8);
        mylist.addLast(10);
        mylist.add(5,12);

        mylist.printList();

        mylist.removeLast();
        System.out.println();
        mylist.printList();
        System.out.println();
        mylist.clearList();
        mylist.printList();
    }


}
