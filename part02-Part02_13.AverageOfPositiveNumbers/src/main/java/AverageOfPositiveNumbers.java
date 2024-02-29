
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to calculate the average
        int count = 0;
        int sum = 0;

        // Ask user input repeatedly
        while (true) {
            int input = scanner.nextInt();

            // Stop if input is 0
            if (input == 0) {
                break;
            }
            if (input < 0) {
                continue;
            }
            count = count + 1;
            sum = sum + input;
        }

        if (count == 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(1.0 * sum / count);
        }

    }
}
