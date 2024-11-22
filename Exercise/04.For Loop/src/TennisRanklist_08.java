import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tournaments = sc.nextInt();
        int totalPoints = sc.nextInt();

        double averagePoints = 0;
        int wins = 0;

        for (int i = 0; i < tournaments; i++) {
            String tournamentStage = sc.next().toLowerCase();

            int tournamentPoints = 0;
            switch (tournamentStage) {
                case "w" -> {
                    tournamentPoints += 2000;
                    wins++;
                }
                case "f" -> tournamentPoints += 1200;
                case "sf" -> tournamentPoints += 720;
            }

            totalPoints += tournamentPoints;
            averagePoints += tournamentPoints;
        }

        averagePoints /= tournaments;
        double winPercentage = ((double) wins / tournaments) * 100;
        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", winPercentage);
    }
}
