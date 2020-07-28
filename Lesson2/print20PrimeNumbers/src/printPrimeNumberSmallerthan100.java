public class printPrimeNumberSmallerthan100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100){
            if (isPrimeNumber(N)){
                System.out.println(N);
            }
            N++;
        }
    }

    public static boolean isPrimeNumber(int num){
        boolean check = true;
        double n = Math.sqrt(num);
        for (int i = 2; i <= n ; i++) {
            if (num % i == 0)
                check = false;
        }
        return check;
    }

}
