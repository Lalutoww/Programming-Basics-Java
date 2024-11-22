import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int juniorsCount = sc.nextInt();
        int seniorsCount = sc.nextInt();
        String trackType = sc.next();

        double juniorsTax;
        double seniorsTax;
        switch (trackType) {
            case "trail" -> {
                juniorsTax = 5.50;
                seniorsTax = 7;
            }
            case "cross-country" -> {
                juniorsTax = 8;
                seniorsTax = 9.50;
            }
            case "downhill" -> {
                juniorsTax = 12.25;
                seniorsTax = 13.75;
            }
            case "road" -> {
                juniorsTax = 20;
                seniorsTax = 21.50;
            }
            default -> {
                juniorsTax = 0;
                seniorsTax = 0;
            }
        }
        double totalTax = juniorsTax * juniorsCount + seniorsTax * seniorsCount;
        if (juniorsCount + seniorsCount >= 50 && trackType.equals("cross-country")) totalTax *= 0.75;

        // Expenses
        totalTax *= 0.95;

        System.out.printf("%.2f", totalTax);
    }
}
