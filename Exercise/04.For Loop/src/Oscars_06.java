import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double POINTS_NEEDED = 1250.5;

        String authorName = sc.nextLine();
        double authorPoints = sc.nextDouble();
        sc.nextLine();
        int evaluators = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < evaluators; i++) {
            String evaluatorName = sc.nextLine();
            double evaluatorPoints = sc.nextDouble();
            sc.nextLine();
            int evaluatorNameLength = evaluatorName.length();

            double totalEvaluatorPoints = (evaluatorNameLength * evaluatorPoints) / 2;

            authorPoints += totalEvaluatorPoints;

            if (authorPoints >= POINTS_NEEDED) break;
        }

        if (authorPoints >= POINTS_NEEDED)
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", authorName, authorPoints);
        else System.out.printf("Sorry, %s you need %.1f more!", authorName, POINTS_NEEDED - authorPoints);
    }
}
