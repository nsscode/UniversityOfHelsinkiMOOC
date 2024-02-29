
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Continue reading strings until user stops
            // Let user input string
            String input = scanner.nextLine();

            if (input.equals("")) { // Stop reading input if string is empty
                break;
            }

            // Break string into multiple strings after each " "
            String[] words = input.split(" "); // Save strings in array called 'words'

            // Iterate through all strings
            for (String word : words) {
                System.out.println(word); // Print each string
            }

        }

    }
}
