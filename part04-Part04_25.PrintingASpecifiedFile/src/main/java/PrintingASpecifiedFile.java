
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user which file should be printed
        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();

        // Search for the file name the user inputted
        try (Scanner scanner2 = new Scanner(Paths.get(input))) {
            // Print each line in the file
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                System.out.println(line);
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("File not found" + e.getMessage());
        }

    }
}
