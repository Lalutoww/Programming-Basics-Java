import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chrysanthemumsCount = sc.nextInt();
        int roseCount = sc.nextInt();
        int tulipCount = sc.nextInt();
        String season = sc.next().toLowerCase();
        char isHoliday = sc.next().toLowerCase().charAt(0);

        double chrysanthemumsPrice, rosePrice, tulipPrice;
        switch (season) {
            case "spring", "summer" -> {
                chrysanthemumsPrice = 2.00;
                rosePrice = 4.10;
                tulipPrice = 2.50;
            }
            case "autumn", "winter" -> {
                chrysanthemumsPrice = 3.75;
                rosePrice = 4.50;
                tulipPrice = 4.15;
            }
            default -> {
                chrysanthemumsPrice = 0;
                rosePrice = 0;
                tulipPrice = 0;
            }
        }
        ;

        double totalFlowers = tulipCount + roseCount + chrysanthemumsCount;
        double totalPrice = chrysanthemumsCount * chrysanthemumsPrice + roseCount * rosePrice + tulipCount * tulipPrice;

        if (isHoliday == 'y') totalPrice *= 1.15;

        if (tulipCount > 7 && season.equals("spring")) totalPrice *= 0.95;
        if (roseCount >= 10 && season.equals("winter")) totalPrice *= 0.90;
        if (totalFlowers > 20) totalPrice *= 0.80;

        // bouquet arrangement price
        totalPrice += 2;

        System.out.printf("%.2f", totalPrice);

    }
}
