public class LazyPrimeFactorization implements Runnable {

    private static final int END = 50;
    @Override
    public void run() {
        int number = 1;
        while (number < END) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }

    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
