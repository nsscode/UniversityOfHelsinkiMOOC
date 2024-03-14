import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the filename
        System.out.println("Filename:");
        String file = scanner.nextLine();

        // Save the content of file in a collection 'records' with person objects
        ArrayList<Person> records = readRecordsFromFile(file);

        // Print the size of the record
        System.out.println("Persons: " + records.size());

        // Print the persons in the collection
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
        }
    }

    // Method to read records from a file and return them as an array of Person objects
    public static ArrayList<Person> readRecordsFromFile(String file) {
        // Create an ArrayList to store Person objects
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            // Loop through each line of the file
            while (fileScanner.hasNextLine()) {
                // Read the line and split it by commas to separate name and age
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                // Extract name and age from the split line
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                // Create a new Person object with the extracted name and age, and add it to the array
                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            // Print error message if any exception occurs during file reading
            System.err.println(e.getMessage());
        }

        // Return the ArrayList containing Person objects
        return persons;
    }
}