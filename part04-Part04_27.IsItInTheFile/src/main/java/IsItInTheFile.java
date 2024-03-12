
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user the name of the file
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        // Ask the user what to search for
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        // Find the inputted file
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            // Create flag to track if found
            boolean found = false;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains(searchedFor)) {
                    found = true; // Set flag to true
                    System.out.println("Found!");
                    break;
                }
            }
            if (!found) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
    }
}