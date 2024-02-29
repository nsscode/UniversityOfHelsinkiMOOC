
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Continue reading strings until user stops
            String input = scanner.nextLine(); // Read string from user

            if (input.equals("")) { // Stop reading if the inputted string is empty
                break;
            }
            // Break string into multiple strings after each " "
            String[] words = input.split(" "); // Strings get saved in array called 'words'

            // Iterate through all the strings in the array
            for (String word : words) {
                if (word.contains("av")) { // Check if a string contains 'av'
                    System.out.println(word); // If so, print this string
                }
            }

        }
    }
}
