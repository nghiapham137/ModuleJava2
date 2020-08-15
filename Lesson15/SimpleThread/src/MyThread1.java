public class MyThread1 extends Thread{
    NumberGenerator num1;
    MyThread1(NumberGenerator num1) {
        this.num1 = num1;
    }

    public void run() {
        num1.printNumber();
    }

}
