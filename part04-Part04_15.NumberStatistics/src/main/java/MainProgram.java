
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        /*
         * statistics.addNumber(3);
         * statistics.addNumber(5);
         * statistics.addNumber(1);
         * statistics.addNumber(2);
         * 
         * System.out.println("Count: " + statistics.getCount());
         * System.out.println("Sum: " + statistics.sum());
         * System.out.println("Average: " + statistics.average());
         */
        System.out.println("Enter numbers:");

        while (true) {
            int input = scanner.nextInt(); // Let user input number
            if (input == -1) { // Stop if input equals -1
                break;
            }
            if (input % 2 == 0) {
                evenStatistics.addNumber(input);
            }
            if (input % 2 != 0) {
                oddStatistics.addNumber(input);
            }

            statistics.addNumber(input);
        }

        System.out.println("Sum: " + statistics.sum()); // Print sum 
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the
        // exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!
    }
}
