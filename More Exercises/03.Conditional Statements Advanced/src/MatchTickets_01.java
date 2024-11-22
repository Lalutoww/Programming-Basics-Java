import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = sc.nextDouble();
        String category = sc.next().toLowerCase();
        int peopleCount = sc.nextInt();

        final double VIP_TICKET_PRICE = 499.99;
        final double NORMAL_TICKET_PRICE = 249.99;

        double transportPrice;
        if (peopleCount >= 1 && peopleCount <= 4) transportPrice = budget * 0.75;
        else if (peopleCount >= 5 && peopleCount <= 9) transportPrice = budget * 0.60;
        else if (peopleCount >= 10 && peopleCount <= 24) transportPrice = budget * 0.50;
        else if (peopleCount >= 25 && peopleCount <= 49) transportPrice = budget * 0.40;
        else if (peopleCount >= 50) transportPrice = budget * 0.25;
        else transportPrice = 0;

        double totalPrice = switch (category) {
            case "normal" -> transportPrice + peopleCount * NORMAL_TICKET_PRICE;
            case "vip" -> transportPrice + peopleCount * VIP_TICKET_PRICE;
            default -> 0;
        };

        double moneyLeft = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        else System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
    }
}
