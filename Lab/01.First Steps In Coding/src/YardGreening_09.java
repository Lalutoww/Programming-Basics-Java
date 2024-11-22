import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        final double PRICE_PER_SQUARE_METER = 7.61;
        final double DISCOUNT_PERCENT = 0.18;

        Scanner scan = new Scanner(System.in);
        double yardSquareMeters = Double.parseDouble(scan.nextLine());
        //The person always gets a discount (task condition)
        double discount = (yardSquareMeters * PRICE_PER_SQUARE_METER) * DISCOUNT_PERCENT;
        double discountedPrice = (yardSquareMeters * PRICE_PER_SQUARE_METER) - discount;

        System.out.printf("The final price is: %.2f lv.\n", discountedPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
