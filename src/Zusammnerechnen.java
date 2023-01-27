import java.util.Scanner;

public class Zusammnerechnen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter first number");
        int zahl1 = Integer.parseInt(scanner.nextLine());  // Read user input

        System.out.println("Enter second number");
        int zahl2 = Integer.parseInt(scanner.nextLine());  // Read user input

        int größe = berechne(zahl1, zahl2);
        System.out.println(größe);
    }
    public static int berechne(int zahl1, int zahl2){
        int i = zahl1 + zahl2;
        return i;
    }
}