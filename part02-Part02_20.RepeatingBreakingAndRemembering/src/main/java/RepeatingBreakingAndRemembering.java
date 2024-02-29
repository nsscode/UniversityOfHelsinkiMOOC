
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        // Store the sum in
        int sum = 0;

        // Count how many times user inputs a number
        int count = 0;

        // Store even numbers
        int even = 0;

        // Store odd numbers
        int odd = 0;

        // Ask the user to write a number
        System.out.println("Give numbers:");

        // Loop that repeatedly asks for user input
        while (true) {
            // Store the number
            int input = scanner.nextInt();

            // Break loop and print bye when user inputs -1
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;

            }

            // Calculate the sum
            sum += input;

            // Count the number of numbers
            count++;

        }

        // Print the sum
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
