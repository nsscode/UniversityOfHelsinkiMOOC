
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        System.out.println("");

        // implement here finding the indices of a number
        // Ask the user a number
        System.out.print("Search for? ");
        int searchNumber = scanner.nextInt();

        // Create a loop to go through all numbers
        for (int index = 0; index < list.size(); index++) {
            // Create var checks per index what the number is
            int matchingIndex = list.get(index);

            // If the number the user searches for matches the previous var
            if (searchNumber == matchingIndex) {
                // Then we only need to know at what index this number lies
                // Var index started counting from 0 thus is the index
                System.out.println(searchNumber + " is at index " + index);
            }
        }

    }
}
