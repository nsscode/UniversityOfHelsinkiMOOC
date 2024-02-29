
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.println("Give a number:");
        int number = scanner.nextInt();

        int factorial = 1;

        for (int count = 1; count <= number; count++) {
            factorial = factorial * count;

        }
        System.out.println("Factorial: " + factorial);
    }
}
