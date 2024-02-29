
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        // Ask the user where to
        System.out.println("Where to?");
        int whereTo = scanner.nextInt();

        // Ask user where from
        System.out.println("Where from?");
        int whereFrom = scanner.nextInt();

        // Create a loop
        while (whereFrom <= whereTo) {

            System.out.println(whereFrom);
            whereFrom++;
        }

    }
}
