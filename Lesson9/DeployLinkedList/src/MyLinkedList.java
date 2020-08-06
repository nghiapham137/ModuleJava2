import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNode = 0;
    private Node tail;

    private class Node {
        private Node next;

        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return data + "";
        }
    }

    public MyLinkedList() {

//        head = new Node(data);
//        tail = head;
    }

    public void add(int index, E element) {
       if (index == 0) addFirst(element);
       else if (index >= numNode) addLast(element);
       else {
           Node current = head;
           for (int i = 1; i < index ; i++)
               current = current.next;
           Node temp = current.next;
           current.next = new Node(element);
           (current.next).next = temp;
           numNode++;
       }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNode++;

        if (tail == null)
            tail = head;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);

        if (tail == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }

        numNode++;

    }

    public E remove(int index) {
        if (index < 0 || index >= numNode) return null;
        else if (index == 0) return removeFirst();
        else if (index == numNode - 1) return removeLast();
        else {
            Node previous = head;

            for (int i = 1; i < index ; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            numNode-- ;
            return (E) current.data;
        }
    }

    public E removeFirst() {
        if (numNode == 0) return null;
        else {
            Node temp = head;
            head = head.next;
            numNode--;
            if (head == null) tail = null;
            return (E) temp.data;
        }
    }

    public E removeLast() {
        if (numNode == 0) return null;
        else if (numNode == 1) {
            Node temp = head;
            head = tail = null;
            numNode = 0;
            return (E) temp.data;
        } else {
            Node temp = getNode(numNode - 2);
            temp.next = null;
            tail = temp;
            return (E) temp.data;
        }
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int size() {
        return this.numNode;
    }

    public void clearList() {
        Node temp = head;
        for (int i = 0; i < numNode -1; i++) {
            temp.data = null;
            temp = temp.next;

        }

    }
}
