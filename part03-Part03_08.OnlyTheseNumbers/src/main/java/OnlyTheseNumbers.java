
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        // Ask the user from where
        System.out.print("From where? ");
        // Let the user input a number
        int indexStart = scanner.nextInt();

        // Ask the user to where
        System.out.print("To where? ");
        // Let user input a number
        int indexEnd = scanner.nextInt();

        // Find & print int indexStart in the array
        System.out.println(numbers.get(indexStart));
        System.out.println(numbers.get(indexEnd));

    }
}
