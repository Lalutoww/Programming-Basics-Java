import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String season = sc.next().toLowerCase();
        double kmPerMonth = sc.nextDouble();

        double totalPrice = 0;
        switch (season) {
            case "spring", "autumn" -> {
                if (kmPerMonth <= 5000) totalPrice = kmPerMonth * 0.75;
                else if (kmPerMonth >= 5001 && kmPerMonth <= 10000) totalPrice = kmPerMonth * 0.95;
            }
            case "summer" -> {
                if (kmPerMonth <= 5000) totalPrice = kmPerMonth * 0.90;
                else if (kmPerMonth >= 5001 && kmPerMonth <= 10000) totalPrice = kmPerMonth * 1.10;
            }
            case "winter" -> {
                if (kmPerMonth <= 5000) totalPrice = kmPerMonth * 1.05;
                else if (kmPerMonth >= 5001 && kmPerMonth <= 10000) totalPrice = kmPerMonth * 1.25;
            }
        }
        if (kmPerMonth > 10000 && kmPerMonth <= 20000) totalPrice = kmPerMonth * 1.45;

        // after taxes
        totalPrice *= 0.9;

        //full season
        totalPrice *= 4;

        System.out.printf("%.2f", totalPrice);
    }
}
