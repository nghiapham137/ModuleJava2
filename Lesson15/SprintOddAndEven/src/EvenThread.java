public class EvenThread implements Runnable {
    public  void run() {
        try {
            for (int i = 0; i < 11; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    Thread.sleep(15);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
