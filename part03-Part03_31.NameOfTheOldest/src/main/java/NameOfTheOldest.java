
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variable outside of loop
        int ageOldest = -1; // Initialize age to -1 to prevent errors
        String nameOldest = "";

        while (true) { // Continue reading input until user stops
            String input = scanner.nextLine();
            if (input.equals("")) { // Stop reading if input is empty
                break;
            }

            // Break string in multiple strings
            String[] parts = input.split(","); // Strings saved in array parts

            // Save second part of input (age) as an integer
            int currentAge = Integer.valueOf(parts[1]); // Age is the second part of string [1]
            
            // If the age in the current input is higher than the already saved oldest age
            if (currentAge > ageOldest) {
                ageOldest = currentAge; // then set the current age as the new oldest age 
                nameOldest = parts[0]; // Therefor the name of the oldest is the first part of the input

            }

        }

        System.out.println("Name of the oldest: " + nameOldest);

    }
}