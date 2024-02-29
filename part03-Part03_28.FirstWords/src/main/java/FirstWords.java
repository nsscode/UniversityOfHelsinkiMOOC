
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Continue reading strings until user stops
            String input = scanner.nextLine(); // Read string from user

            if (input.equals("")) { // Stop reading if inputted string is empty
                break;
            }
        // Break the string into multiple strings after each " "    
        String words[] = input.split(" "); // Strings are saved in array 'words'
        
        // Print only the first string
        System.out.println(words[0]);
        
        }
    }
}
