
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // Print blank space
        System.out.println("");

        // Declare sum variable outside of loop since it will be used outside of loop
        int sum = 0;

        // Iterate through the list to calculate each sum
        for (Integer number : list) {
            sum = sum + number; // Add each number to the sum
        }

        // Print after the loop completes
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / list.size());
    }
}
