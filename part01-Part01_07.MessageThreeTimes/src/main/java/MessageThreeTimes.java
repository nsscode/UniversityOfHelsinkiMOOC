
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Let the user write a message
        System.out.println("Write a message:");
        
        // Save message in a string
        String message = scanner.nextLine();

        // Print string three times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);


    }
}
