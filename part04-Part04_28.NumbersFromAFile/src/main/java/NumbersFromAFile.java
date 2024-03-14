
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;

        // Ask user for what file
        System.out.print("File? ");
        String file = scanner.nextLine();

        // Ask the user the lower bound
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        // Ask the user the upper bound
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        // Search for the specified file
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                // Save the next line as an integer
                int line = Integer.valueOf(scanner2.nextLine());
                if (line >= lowerBound && line <= upperBound) {
                    numbers++;
                }
            }
        } catch (Exception e) {

        }
        
        // Print the numbers
        System.out.println("Numbers: " + numbers);

    }

}
