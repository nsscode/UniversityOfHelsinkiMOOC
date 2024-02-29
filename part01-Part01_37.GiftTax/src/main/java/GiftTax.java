
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int valueGift = scan.nextInt();
        if (valueGift < 5000) {
            System.out.println("No tax!");
        } else if (valueGift <= 25000 && valueGift >= 5000) {
            System.out.println("Tax: " + (100 + (valueGift - 5000) * 0.08));
        } else if (valueGift <= 55000 && valueGift >= 25000) {
            System.out.println("Tax: " + (1700 + (valueGift - 25000) * 0.10));
        } else if (valueGift <= 200000 && valueGift >= 55000) {
            System.out.println("Tax: " + (4700 + (valueGift - 55000) * 0.12));
        } else if (valueGift <= 1000000 && valueGift >= 200000) {
            System.out.println("Tax: " + (22100 + (valueGift - 200000) * 0.15));
        } else if (valueGift > 1000000) {
            System.out.println("Tax: " + (142100 + (valueGift - 1000000) * 0.17));
        }
    }
}
