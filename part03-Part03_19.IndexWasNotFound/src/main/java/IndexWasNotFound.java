
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        // Ask the user to search for a number
        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine()); // store number

        boolean found = false; // flag to track if number was found

        for (int index = 0; index < array.length; index++) {
            int matchingIndex = array[index];
            System.out.println(array[index]);
            if (searching == matchingIndex) {
                System.out.println(searching + " is at index " + index + ".");
                found = true; // set flag to true if number is found
            }
        }

        // If the number is not found, print the message
        if (!found) {
            System.out.println(searching + " was not found.");
        }
    }
}