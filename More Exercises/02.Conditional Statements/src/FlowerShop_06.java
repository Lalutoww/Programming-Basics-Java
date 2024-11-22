import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {
        final double MAGNOLIA_PRICE = 3.25;
        final double HYACINTH_PRICE = 4.00;
        final double ROSE_PRICE = 3.50;
        final double CACTUS_PRICE = 8.00;

        Scanner sc = new Scanner(System.in);
        int magnolias = sc.nextInt();
        int hyacinth = sc.nextInt();
        int rose = sc.nextInt();
        int cactus = sc.nextInt();
        double presentPrice = sc.nextDouble();

        double income = (magnolias * MAGNOLIA_PRICE + hyacinth * HYACINTH_PRICE + rose * ROSE_PRICE + cactus * CACTUS_PRICE) * 0.95;

        double moneyLeft = Math.abs(income - presentPrice);

        if (income >= presentPrice) System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft));
        else System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyLeft));

    }
}
