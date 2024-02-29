
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // To ask for input
        int input = scanner.nextInt();

        // Create a loop
        for (int count = 0; count <= input; count++) {
            System.out.println(count);
        }
    }
}
