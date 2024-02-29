
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }

        // Save outside loop since it's used outside loop
        int currentSmallest = numbers.get(0);

        // Iterate over all numbers in array to find the smallest
        for (int index = 0; index < numbers.size(); index++) {
            // The current number starts at index 0
            // Moves up from here
            int currentNumber = numbers.get(index);
            // If the current number turns out to be smaller
            // than the last saved currentSmallest
            // it will update as the new 'currentSmallest'
            if (currentNumber < currentSmallest) {
                currentSmallest = currentNumber;
            }
        }

        // Print the smallest number
        System.out.println("Smallest number: " + currentSmallest);

        // Iterate over all numbers in array to find current smallest
        // matching index(es)
        for (int index = 0; index < numbers.size(); index++) {
            // We want to find out what number is equal to currentSmallest
            // For this we will iterate through all numbers
            // matchSmallest starts at index 0 and moves up
            int matchSmallest = numbers.get(index);
            if (currentSmallest == matchSmallest) {
                // If they turn out to be the same number
                // We will print at what index this was found
                System.out.println("Found at index: " + index);
            }

        }

    }
}
