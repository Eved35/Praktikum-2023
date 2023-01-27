import java.util.Scanner;

public class KGV {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number");
        int z1 = scanner.nextInt();
        System.out.print("Enter second number");
        int z2 = scanner.nextInt();

        int a = z1;
        int b = z2;

        while (a != b) {
            if (a < b) {
                a += z1;
            } else {
                b+= z2;
            }
        }

        System.out.println("KGV: " + a);

    }
}