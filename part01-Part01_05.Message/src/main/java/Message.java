
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Print write a message
        System.out.println("Write a message:");

        // Safe what the user wrote in a string called berichtje
        String berichtje = scanner.nextLine();

        // Print out the message
        System.out.println("Dit is jouw bericht: " + berichtje);

    }
}
