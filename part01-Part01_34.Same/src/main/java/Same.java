
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String firstString = input.nextLine();
        System.out.println("Enter the second string:");
        String secondString = input.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
