
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // String
        System.out.println("Give a string:");
        String stringy = scanner.nextLine();
        
        // Integer
        System.out.println("Give an integer:");
        int integery = Integer.valueOf(scanner.nextLine());

        // Double
        System.out.println("Give a double:");
        double doubley = Double.valueOf(scanner.nextLine());

        // Boolean
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        // Output
        System.out.println("You gave the string " + stringy);
        System.out.println("You gave the integer " + integery);
        System.out.println("You gave the double " + doubley);
        System.out.println("You gave the boolean " + trueOrFalse);


    }
}
