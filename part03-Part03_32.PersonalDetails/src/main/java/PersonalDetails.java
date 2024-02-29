
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare these variables outside of loop
        int lengthLongestName = 0; // length of the longest name
        int lengthCurrentName = 0; // lenght of current input name
        String longestName = ""; // The actual longest name
        int sum = 0; // sum of all birth years
        int count = 0; // how many times birth year been inputted
        int birthYear = 0; // the year of birth

        while (true) { // Continue reading input until input is empty
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            // Break inputted string in multiple parts
            String[] parts = input.split(","); // Break after each , save in parts

            for (int i = 0; i < parts.length; i++) {
                // To calculate the average
                birthYear = Integer.valueOf(parts[1]); // Initialize birthyear to be an integer
                sum += birthYear; // Calculate sum of all birthyears
                count++;

                // Initialize length of current name
                lengthCurrentName = parts[0].length();

                // Check if the length of the current name is longer than the longest name
                if (lengthCurrentName > lengthLongestName) {
                    lengthLongestName = lengthCurrentName; // If so, save this as the new longest name
                    longestName = parts[0];
                }
            }
        }

        // Print the longest name
        System.out.println("Longest name: " + longestName);
        // Print average of birth years
        System.out.println("Average of the birth years: " + 1.0 * sum / count);

    }
}
