
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int number : array) { // Iterate through each element in loop
            // For each individual element add stars until equal to the number of the element
            for (int i = 0; i < number; i++) { 
                System.out.print("*"); // use print instead of println so they appear next to each other
            }
            System.out.println(""); // print blank line after each row of stars
        }
    }

}
