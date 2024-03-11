
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            // Your code to read the file goes here
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
