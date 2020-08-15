public class OddThread implements Runnable{
    public  void run() {

        try {
            for (int i = 0; i < 11; i++) {
                if (i % 2 == 1) {
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
