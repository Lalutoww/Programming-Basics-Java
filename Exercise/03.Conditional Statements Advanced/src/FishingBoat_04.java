import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = sc.nextInt();
        String season = sc.next();
        int fishermen = sc.nextInt();


        double totalPrice = switch (season) {
            case "Spring" -> 3000;
            case "Summer", "Autumn" -> 4200;
            case "Winter" -> 2600;
            default -> 0;
        };

        if (fishermen <= 6) totalPrice *= 0.9;
        else if (fishermen >= 7 && fishermen <= 11) totalPrice *= 0.85;
        else totalPrice *= 0.75;

        if (fishermen % 2 == 0 && !season.equals("Autumn")) totalPrice *= 0.95;

        double moneyLeft = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        else System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
    }
}
