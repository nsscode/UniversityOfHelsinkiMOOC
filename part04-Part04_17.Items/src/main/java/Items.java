
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String nameItem = scanner.nextLine();
            if (nameItem.isEmpty()) {
                break;
            }
            // Add to the list a new item
            // whose name is the previous user input
            items.add(new Item(nameItem));
            }
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

