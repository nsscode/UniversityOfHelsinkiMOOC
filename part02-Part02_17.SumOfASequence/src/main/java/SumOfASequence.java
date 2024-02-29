
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for last number
        System.out.println("Last number?");

        // User input variable
        int input = scanner.nextInt();

        // Variable to store the sum
        int sum = 0;

        // loop
        for (int count = 1; count <= input; count++) {
            sum += count;
        }

        System.out.println("The sum is " + sum);
    }
}
