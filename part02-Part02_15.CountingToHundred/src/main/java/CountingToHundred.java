
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        int input = scanner.nextInt();

        // Create a loop
        while (input <= 100) {
            System.out.println(input);
            input++;
        }

    }
}
