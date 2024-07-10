import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallestNumber = array[0];

        for (int number : array) {
            if (smallestNumber > number) {
                smallestNumber = number;
            }
        }

        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestNumber = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            if (smallestNumber > currentNumber) {
                smallestNumber = currentNumber;
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNumber = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            int currentNumber = table[i];
            if (smallestNumber > currentNumber) {
                smallestNumber = currentNumber;
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int index1BeforeFirstSwap = array[index1];
        array[index1] = array[index2];
        array[index2] = index1BeforeFirstSwap;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }

    }

}
