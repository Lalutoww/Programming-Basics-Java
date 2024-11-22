import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double ROSE_PRICE = 5.00;
        final double DAHLIA_PRICE = 3.80;
        final double TULIP_PRICE = 2.80;
        final double NARCISSUS_PRICE = 3.00;
        final double GLADIOLUS_PRICE = 2.50;

        String flowerType = sc.next();
        int flowerQuantity = sc.nextInt();
        double budget = sc.nextDouble();
        double totalPrice = switch (flowerType) {
            case "Roses" -> flowerQuantity * ROSE_PRICE;
            case "Dahlias" -> flowerQuantity * DAHLIA_PRICE;
            case "Tulips" -> flowerQuantity * TULIP_PRICE;
            case "Narcissus" -> flowerQuantity * NARCISSUS_PRICE;
            case "Gladiolus" -> flowerQuantity * GLADIOLUS_PRICE;
            default -> 0.00;
        };

        if (flowerType.equals("Roses") && flowerQuantity > 80) totalPrice *= 0.90;
        else if (flowerType.equals("Dahlias") && flowerQuantity > 90) totalPrice *= 0.85;
        else if (flowerType.equals("Tulips") && flowerQuantity > 80) totalPrice *= 0.85;
        else if (flowerType.equals("Narcissus") && flowerQuantity < 120) totalPrice *= 1.15;
        else if (flowerType.equals("Gladiolus") && flowerQuantity < 80) totalPrice *= 1.20;

        double moneyLeft = Math.abs(budget - totalPrice);

        if (totalPrice <= budget)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerQuantity, flowerType, moneyLeft);
        else System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
    }
}
