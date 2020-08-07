public class MyLinkedListQueue {
    private Node front;
    private Node rear;

    public class Node {
        public int data;
        public Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }

        public Node(){
        }
    }


//    public MyLinkedListQueue() {
//        this.front = null;
//        this.rear = null;
//    }

    public void enQueque(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }else {
            this.rear.link = temp;
            this.rear = temp;
            this.rear.link = this.front;
        }


    }

    public void deQueue() {
        if (this.front == null) {
            this.front = this.rear = null;
        }
        if (this.front == this.rear) {
            this.front = this.rear = null;
        }else {
            this.front = this.front.link;
            this.rear.link = this.front;
        }
//
    }

    public void display(){
        Node temp= this.front;
        System.out.printf("Element in Circle Queue are: ");
        while (temp.link!=this.front){
            System.out.printf("%d"+ " ",temp.data);
            temp=temp.link;
        }
        System.out.printf("%d",temp.data);
    }

}
