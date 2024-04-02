
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archiveList = new ArrayList<>();

        while (true) {
            // Ask user for an identifier
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            // Empty stops loop from running
            if (identifier.isEmpty()) {
                break;
            }
            // Ask user for a name
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            // Empty stops loop from running
            if (name.isEmpty()) {
                break;
            }

            // Create new object of the type Archive
            Archive newItem = new Archive(identifier, name);

            // If the list of Archive objects doesn't already contain an equal object
            // add it to the collection
            if (!(archiveList.contains(newItem))) {
                archiveList.add(newItem);
            }

        }

        System.out.println("==Items==");
        
        // Print out all the items in the list of Archive objects
        for (Archive item : archiveList) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }

    }
}
