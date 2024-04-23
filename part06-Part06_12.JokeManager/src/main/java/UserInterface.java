import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printCommands();

            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            executeCommands(command);
        }
    }




    public void printCommands() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

    public void executeCommands(String command) {
        if (command.equals("1")) {
            this.addJoke();
        } else if (command.equals("2")) {
            this.drawJoke();
        } else if (command.equals("3")) {
            this.printJokes();
        }
    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokeManager.addJoke(joke);
    }

    public void drawJoke() {
        System.out.println(jokeManager.drawJoke());
    }

    public void printJokes() {
        jokeManager.printJokes();
    }

}
