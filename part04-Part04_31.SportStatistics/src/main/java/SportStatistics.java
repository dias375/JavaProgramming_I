
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int gamesPlayed = 0;
        int teamWins = 0;
        int teamLosses = 0;

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] linePieces = line.split(",");

                String teamZeroName = linePieces[0];
                String teamOneName = linePieces[1];

                int teamZeroPoints = Integer.valueOf(linePieces[2]);
                int teamOnePoints = Integer.valueOf(linePieces[3]);

                boolean containsNameZero = teamZeroName.equals(teamName);
                boolean containsNameOne = teamOneName.equals(teamName);

                boolean zeroWon = (teamZeroPoints > teamOnePoints);
                boolean oneWon = (teamOnePoints > teamZeroPoints);

                boolean teamHasPlayed = (containsNameZero || containsNameOne);

                if (teamHasPlayed) {
                    gamesPlayed++;
                } else {
                    continue;
                }

                if (containsNameZero && zeroWon) {
                    teamWins++;
                } else if (containsNameOne && oneWon) {
                    teamWins++;
                } else {
                    teamLosses++;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLosses);

    }

}
