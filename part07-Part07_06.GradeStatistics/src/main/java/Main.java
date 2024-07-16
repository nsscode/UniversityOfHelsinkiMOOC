
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points pointList = new Points();
        UserInterface intFace = new UserInterface(scanner, pointList);

        intFace.start();


        

    }
}
