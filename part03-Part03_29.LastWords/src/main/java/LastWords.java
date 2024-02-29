
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Continue reading input until user stops
            String input = scanner.nextLine();

            if (input.equals("")) { // Stop reading if inputted string is empty
                break;
            }

            // Split the string into multiple strings after each space
            String[] words = input.split(" "); // Strings are saved in array 'words'

            // Refer to the index of the last word in the array
            Integer lastWord = words.length - 1;

            // Print the last word of the array
            System.out.println(words[lastWord]);

        }
    }
}
