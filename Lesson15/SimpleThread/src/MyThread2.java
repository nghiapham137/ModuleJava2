public class MyThread2 extends Thread{
    NumberGenerator num2;

    MyThread2(NumberGenerator num2) {
        this.num2 = num2;
    }

    public void run() {
        num2.printNumber();
    }
}
