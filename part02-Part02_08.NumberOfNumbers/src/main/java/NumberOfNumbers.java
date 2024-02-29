
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Keep track of how many times user inputs numbers
        int numInput = 0;

        // The task is true to read input from user
        while (true) {
            // Task is to read input from the user
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            // Exit the loop when the user types 0
            if (input == 0) {
                break;
            }
            // If input is not 0, add 1 to how many times the user tried
            if (input != 0) {
                numInput = numInput + 1;
            }
        }
        // The task is to print out the total number of times
        // the user inputted values
        System.out.println("Number of numbers: " + numInput);
    }
}
