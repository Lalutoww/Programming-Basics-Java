import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        final int FACEBOOK_PENALTY = 150;
        final int INSTAGRAM_PENALTY = 100;
        final int REDDIT_PENALTY = 50;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double salary = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            String website = sc.next();

            salary -= switch (website) {
                case "Facebook" -> FACEBOOK_PENALTY;
                case "Instagram" -> INSTAGRAM_PENALTY;
                case "Reddit" -> REDDIT_PENALTY;
                default -> 0;
            };
            if (salary <= 0) break;
        }

        if (salary <= 0) System.out.println("You have lost your salary.");
        else System.out.printf("%.0f", salary);
    }
}
