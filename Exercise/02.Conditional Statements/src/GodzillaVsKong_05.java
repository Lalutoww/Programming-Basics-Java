import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = sc.nextDouble();
        int statistician = sc.nextInt();
        double clothesPrice = sc.nextDouble();
        double decor = budget * 0.10;

        if (statistician > 150) clothesPrice *= 0.9;

        double neededMoney = decor + statistician * clothesPrice;
        double moneyLeft = budget - neededMoney;

        if (moneyLeft >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(moneyLeft));

        }

    }
}
