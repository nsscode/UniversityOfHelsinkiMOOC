
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            // input a number
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            // if negative number
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            // if positive number
            if (number > 0) {
                System.out.println(Math.pow(number, 2));
            }
            // if equal zero
            if (number == 0) {
                break;
            }
        }
    }
}
