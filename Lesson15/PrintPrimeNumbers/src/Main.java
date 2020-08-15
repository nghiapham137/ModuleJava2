public class Main {
    public static void main(String[] args) {
        Runnable r = new LazyPrimeFactorization();
        Thread t1 = new Thread(r);
        t1.start();

        Runnable r1 = new OptimizedPrimeFactorization();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}
