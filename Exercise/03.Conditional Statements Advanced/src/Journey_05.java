import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = sc.nextDouble();
        String season = sc.next();

        String destination;
        String place = switch (season) {
            case "summer" -> "Camp";
            case "winter" -> "Hotel";
            default -> "error";
        };
        double totalPrice = 0;


        if (budget <= 100) {
            destination = "Bulgaria";
            totalPrice = switch (season) {
                case "summer" -> budget * 0.30;
                case "winter" -> budget * 0.70;
                default -> 0.00;
            };
        } else if (budget <= 1000) {
            destination = "Balkans";
            totalPrice = switch (season) {
                case "summer" -> budget * 0.40;
                case "winter" -> budget * 0.80;
                default -> 0.00;
            };
        } else {
            destination = "Europe";
            place = "Hotel";
            totalPrice = budget * 0.90;
        }

        System.out.printf("Somewhere in %s \n", destination);
        System.out.printf("%s - %.2f", place, totalPrice);
    }
}
