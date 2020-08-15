public class Test {
    public static void main(String[] args) {

        Runnable r2 = new EvenThread();
        Thread et = new Thread(r2);
        et.start();
        try {
            et.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runnable r = new OddThread();
        Thread ot = new Thread(r);
        ot.start();
        try {
            ot.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }





}
