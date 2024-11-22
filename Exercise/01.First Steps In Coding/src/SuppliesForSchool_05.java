import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        final double PEN_PRICE = 5.8;
        final double MARKER_PRICE = 7.2;
        final double CLEANER_PRICE_PER_LITER = 1.2;

        Scanner scan = new Scanner(System.in);
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int litersOfCleaner = Integer.parseInt(scan.nextLine());
        int discountPercent = Integer.parseInt(scan.nextLine());

        double priceWithoutDiscount = (pens * PEN_PRICE + markers * MARKER_PRICE + litersOfCleaner * CLEANER_PRICE_PER_LITER);
        double totalPrice = priceWithoutDiscount - priceWithoutDiscount * (discountPercent / 100.0);

        System.out.println(totalPrice);
    }
}
