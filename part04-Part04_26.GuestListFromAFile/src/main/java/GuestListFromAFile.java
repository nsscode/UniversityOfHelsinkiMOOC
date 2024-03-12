
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to input the name of the file
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        // Create a collection to store the content of the file
        ArrayList<String> list = new ArrayList<>();

        // Read the content of the file
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                // Add each line to the collection 'list'
                list.add(scanner2.nextLine());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // Empty line
        System.out.println("");

        // Continue reading input until user inputs an empty line
        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            // Print that the name is on the list if the collection contains specified name
            if (list.contains(name)) {
                System.out.println("The name is on the list.");
                // Otherwise print that the name is not found
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
