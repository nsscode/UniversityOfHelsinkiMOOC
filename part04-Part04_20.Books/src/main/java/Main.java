import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Enable scanner to read input
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        // implement here the program that allows the user to enter
        // book information and to examine them

        while (true) { // Continue loop until user inputs an empty title

            // Ask user for the title of a book
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            // Ask user for the number of pages
            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());

            // Ask user for the publication year
            System.out.print("Publicaton year: ");
            int bookPublication = Integer.valueOf(scanner.nextLine());

            // Add the book information to the collection
            books.add(new Book(bookTitle, bookPages, bookPublication));
        }

        // Empty line
        System.out.println(" ");

        // Ask user what information should be printed
        System.out.println("What information will be printed?");
        String printWhat = scanner.nextLine();

        // Print all information if input equals everything
        if (printWhat.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        }

        // Print only the title if input equals name
        if (printWhat.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
