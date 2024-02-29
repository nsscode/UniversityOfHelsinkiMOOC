
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task is to create a variable that
        // stores the sum of the input
        int sumOfNumbers = 0;


        // Task is for user to input number
        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }
            // Task is to count the sum if not 0
            sumOfNumbers = sumOfNumbers + input;

        }

        // Task is to print the sum of the numbers
        System.out.println("Sum of the numbers: " + sumOfNumbers);



    }
}
