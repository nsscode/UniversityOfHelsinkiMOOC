import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    private Scanner scanner = new Scanner(System.in);
    private BirdWatcher birdWatcher;

    public Interface(Scanner scanner, BirdWatcher birdWatcher) {
        this.scanner = scanner;
        this.birdWatcher = birdWatcher;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                birdWatcher.add(name, latinName);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                birdWatcher.observation(name);
            }

            if (command.equals("All")) {
                birdWatcher.print();
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                birdWatcher.one(name);
            }
        }
        
    }
    
}
