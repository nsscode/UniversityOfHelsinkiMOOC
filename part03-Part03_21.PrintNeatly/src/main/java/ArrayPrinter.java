
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Run through each element in the loop
        for (int index = 0; index < array.length; index++) {
            if (index < array.length - 1) { // If smaller than the last number print with a "," 
                System.out.print(array[index] + ", ");
            } else { // Print the last number without a ","
                System.out.print(array[index]);
            }
        }
    }
}
