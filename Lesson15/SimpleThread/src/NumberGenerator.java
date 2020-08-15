import java.util.Scanner;

public class NumberGenerator{
    public static final int SIZE = 10;

    public synchronized void printNumber() {
        int num = 0;
        for (int i = 0; i < SIZE; i++) {
            num++;
            System.out.println(num);
            System.out.println(this.hashCode());
        }

        try {
            Thread.sleep(500);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
