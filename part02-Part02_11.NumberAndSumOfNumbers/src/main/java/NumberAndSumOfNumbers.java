
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For saving number of numbers and the sum
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;

        // For repeatedly asking for numbers
        while (true) {
            System.out.println("Give a number:");
            // For reading user input
            int numberFromUser = scanner.nextInt();

            // Loop stops when user enters 0
            if (numberFromUser == 0) {
                break;
            }
            // If input is not 0 track the number of numbers
            // and track the sum of the numbers
            numberOfNumbers = numberOfNumbers + 1;
            sumOfNumbers = sumOfNumbers + numberFromUser;
        }
        // For printing the number of numbers
        // and the sum of numbers
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);

    }
}
