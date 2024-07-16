import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Points points;


    public UserInterface(Scanner scanner, Points points) {
        this.scanner = scanner;
        this.points = points;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }

            this.add(input);
        }

        System.out.println("Point average (all): " + this.averagePoints());
        System.out.println("Point average (passing): " + this.averagePassingPoints());
        System.out.println("Pass percentage: " + this.passPercentage());
        System.out.println("Grade distribution: ");
        gradeDistribution(); 
    

    }

    public void add(int input) {
        points.add(input);
    }

    public double averagePoints() {
        return points.pointAverage();
    }

    public double passPercentage () {
        return points.passPercentage();
    }

    public void gradeDistribution() {
        points.gradeDistribution();
    }

    public String averagePassingPoints() {
        double average = points.pointAveragePassing();

        if (average == -1) {
            return "-";
        }
        return String.valueOf(average);

    }
}
