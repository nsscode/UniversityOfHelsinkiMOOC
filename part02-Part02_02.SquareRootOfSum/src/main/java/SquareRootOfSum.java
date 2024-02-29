
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumb = scanner.nextInt();
        int secondNumb = scanner.nextInt();
        int sum = firstNumb + secondNumb;
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);

    }
}
