
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for first number + input
        System.out.println("First number?");
        int firstNumber = scanner.nextInt();

        // Ask the user for second number + input
        System.out.println("Second number?");
        int secondNumber = scanner.nextInt();

        // Initialize the count to start at first number
        int count = firstNumber;

        // Initialize that the sum starts at 0
        int sum = 0;

        // Loop only works when the count is smaller
        // than the second number
        while (count <= secondNumber) {
            sum += count;
            System.out.println(sum);
            count++;
        }
        // Print out the sum
        System.out.println("The sum is " + sum);

    }
}
