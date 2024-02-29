
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(9, 12);

    }

    public static void divisibleByThreeInRange(int numberOne, int numberTwo) {
        for (int i = numberOne; i <= numberTwo; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }

}
