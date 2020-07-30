public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        long sum = 0;
        System.out.println(stopwatch.getStartTime());
        for (long i = 0; i <1000000000 ; i++) {
            sum+= i;
        }
            System.out.println(stopwatch.getEndTime());
        System.out.println(stopwatch.getElapsedTime());
    }
}
