
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageOldest = -1; // Declare variable outside of loop since it will be used outside

        while (true) { // Continue reading input until user stops
            String input = scanner.nextLine();
            if (input.equals("")) { // Stop reading if input is empty
                break;
            }

            // Break string in multiple strings
            String[] parts = input.split(","); // Strings saved in array parts

            int currentAge = Integer.valueOf(parts[1]);
            if (currentAge > ageOldest) {
                ageOldest = currentAge;

            }

        }

        System.out.println("Age of the oldest: " + ageOldest);

    }
}
