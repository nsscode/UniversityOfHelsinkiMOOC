
public class FromOneToParameter {
    static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        printUntilNumber(6);

    }

}
