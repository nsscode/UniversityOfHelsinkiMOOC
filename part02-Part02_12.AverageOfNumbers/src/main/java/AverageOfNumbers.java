
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For saving total of inputs
        int totalUserInputs = 0;
        // For the sum of the numbers
        int sumOfNumbers = 0;

        // For asking the user repeatedly to input number
        while (true) {
            // For asking the user to give a number
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            // To stop the program when the number is 0
            if (input == 0) {
                break;
            }
            // Saving the times user inputs a number
            totalUserInputs = totalUserInputs + 1;
            // Saving the sum of the numbers the user inputs
            sumOfNumbers = sumOfNumbers + input;
        }

        // Formula for calculating the average
        double averageOfNumbers = (double) sumOfNumbers / totalUserInputs;

        // For printing the times the user inputted a number
        System.out.println("Average of the numbers: " + averageOfNumbers);

    }
}
