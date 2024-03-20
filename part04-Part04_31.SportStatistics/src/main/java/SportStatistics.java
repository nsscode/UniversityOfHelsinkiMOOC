import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        // Initialize counters for games played, wins, and losses
        int count = 0, wins = 0, losses = 0;
        Scanner scan = new Scanner(System.in);

        // Prompt user for the file name
        System.out.println("File: ");
        String file = scan.nextLine();

        // Read records from the file and store them in an ArrayList
        ArrayList<Team> records = readRecordsFromFile(file);

        // Prompt the user for the team to get statistics for
        System.out.println("Team: ");
        String teamName = scan.nextLine();

        // Iterate through each team's record
        for (Team team : records) {
            // Check if specified team is the home team
            if (team.getHomeTeam().contains(teamName)) {
                // Increment games played counter
                count += 1;
                // Check if the home team won the game
                if (team.getHomeScore() >= team.getAwayScore()) {
                    wins += 1; // Increment wins counter
                    team.setWins(); // Update wins for the team
                } else {
                    losses += 1; // Increment losses counter
                    team.setLosses(); // Update losses for the team
                }


            } else if (team.getAwayTeam().contains(teamName)) {
                // Increment the games played counter
                count += 1;
                // Check if the away team won the game
                if (team.getAwayScore() >= team.getHomeScore()) {
                    wins += 1; // Increment wins counter
                    team.setWins(); // Update wins for the team
                } else {
                    losses += 1; // Increment losses counter
                    team.setLosses(); // Update losses for the team
                }
            }

        }
        // Print the total number of games played, wins and losses for the specified
        // team
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    // Method to read records from a file and create Team objects
    public static ArrayList<Team> readRecordsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                // Read each line from the file
                String line = scanner.nextLine();

                // Split the line into parts
                String[] parts = line.split(",");

                // Extract information from parts
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                // Create new Team object and add it to the ArrayList
                teams.add(new Team(homeTeam, awayTeam, homeScore, awayScore));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teams;
    }

}