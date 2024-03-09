import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Keep promting the user until they return an empty name
        while (true) {
            // Ask user for the name of the show
            System.out.print("Name: ");
            String nameShow = scanner.nextLine();

            if (nameShow.isEmpty()) {
                break;
            }

            // Ask user for the duration of the show
            System.out.print("Duration: ");
            int durationShow = Integer.valueOf(scanner.nextLine());

            // Create a TelevionProgram object and add it to the collection
            programs.add(new TelevisionProgram(nameShow, durationShow));

        }

        System.out.println(" ");

        // Ask the user for the maximum duration of the show
        System.out.print("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();

        // Print out all the shows that are smaller or equal to the max duration
        for (TelevisionProgram televisionProgram : programs) {
            if (televisionProgram.getDuration() <= maxDuration) {
                System.out.println(televisionProgram);
            }

        }
    }
}
