
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Create password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have succesfully logged in!");

        } else if (username.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
