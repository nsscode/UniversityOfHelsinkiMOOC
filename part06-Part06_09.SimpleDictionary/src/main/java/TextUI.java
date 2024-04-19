import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    // private ArrayList <SimpleDictionary> dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
        // dictionary = new ArrayList<>();
    }

    public void start() {
        while (true) {

            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            this.processCommand(input);
        }
    }

    public void add() {
        // Ask the user for a word
        System.out.print("Word: ");
        String word = scanner.nextLine();

        // Ask the user for translation
        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        dictionary.add(word, translation);
    }

    public void search() {
        // Ask the user what word they want to translate
        System.out.print("To be translated: ");
        String word = scanner.nextLine();

        // Search for the word in the dictonary
        if (dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found.");
        } else {
            System.out.println("Translation: " + dictionary.translate(word));
        }
    }

    public void processCommand(String input) {
        if (input.equals("add")) {
            this.add();

        } else if (input.equals("search")) {
            this.search();
        } else {
            System.out.println("Unknown command");
        }

    }

}
