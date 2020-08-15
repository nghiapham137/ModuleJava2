public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();

        MyThread1 t1 = new MyThread1(numberGenerator);
        MyThread2 t2 = new MyThread2(numberGenerator);

        t1.start();
        t2.start();
    }

}
