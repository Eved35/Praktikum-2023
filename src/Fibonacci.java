public class Fibonacci {
    public static void main(String[] args) {

        int laenge = 50;

        long[] fibonacci = new long[laenge];
        fibonacci[0] = 0;
        System.out.println("Fibonacci von 0: " +fibonacci[0]);
        fibonacci[1] = 1;
        System.out.println("Fibonacci von 1: " +fibonacci[1]);

        for (int i = 2; i < laenge; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.println("Fibonacci von "+i+": " +fibonacci[i]);

        }
    }
}