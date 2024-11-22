import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        final int VIDEO_CARD_PRICE = 250;

        Scanner sc = new Scanner(System.in);
        double budget = sc.nextDouble();
        int videoCards = sc.nextInt();
        int processors = sc.nextInt();
        int ram = sc.nextInt();

        double videoCardsTotal = videoCards * VIDEO_CARD_PRICE;
        double processorsTotal = processors * (videoCardsTotal * 0.35);
        double ramTotal = ram * (videoCardsTotal * 0.1);

        double totalPrice = videoCardsTotal + processorsTotal + ramTotal;

        if (videoCards > processors) totalPrice *= 0.85;

        double moneyLeft = budget - totalPrice;


        if (moneyLeft >= 0) System.out.printf("You have %.2f leva left!", moneyLeft);
        else System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(moneyLeft));
    }
}
