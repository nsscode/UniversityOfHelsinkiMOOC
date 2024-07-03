
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container newFirstContainer = new Container();
        Container newSecContainer = new Container();

        while (true) {
            System.out.println("First: " + newFirstContainer.contains() + "/100");
            System.out.println("Second: " + newSecContainer.contains() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // COMMANDS
            if (command.equals("add")) {
                newFirstContainer.add(amount);
            }

            if (command.equals("move")) {

                if (newFirstContainer.contains() < amount) {
                    amount = newFirstContainer.contains();
                }
                newFirstContainer.remove(amount);
                newSecContainer.add(amount);

            }

            if (command.equals("remove")) {
                newSecContainer.remove(amount);
            }

            System.out.println();

        }
    }
}
