
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The task is to keep track of negative numbers
        int numberOfNegative = 0;

        // The task is to read input from the user
        while (true) {
            System.out.println("Give a number:");
            int userInput = scanner.nextInt();

            // The task is to stop the program when user
            // inputs 0
            if (userInput == 0) {
                break;
            }

            // The task is to count the negative numbers
            if (userInput <= -1) {
                numberOfNegative = numberOfNegative + 1;
            }
        }
        // The task is to print out the total of negative inputs
        System.out.println("Number of negative numbers: " + numberOfNegative);

    }
}
