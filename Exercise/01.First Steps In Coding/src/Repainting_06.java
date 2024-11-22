import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        final double NYLON_PRICE_PER_SUARE_METER = 1.50;
        final double PAINT_PRICE_PER_LITER = 14.50;
        final double PAINT_THINNER_PRICE_PER_LITER = 5.00;

        Scanner scan = new Scanner(System.in);
        int nylonAmount = Integer.parseInt(scan.nextLine()) + 2; // task condition;
        double paintLiters = Double.parseDouble(scan.nextLine()) * 1.1; // task condition
        int paintThinnerLiters = Integer.parseInt(scan.nextLine());
        int hoursNeeded = Integer.parseInt(scan.nextLine());

        double totalMaterialPrice = nylonAmount * NYLON_PRICE_PER_SUARE_METER + paintLiters * PAINT_PRICE_PER_LITER + paintThinnerLiters * PAINT_THINNER_PRICE_PER_LITER + 0.40; // 0.40 for bags
        double pricePerHour = totalMaterialPrice * 0.3;

        double totalPrice = totalMaterialPrice + hoursNeeded * pricePerHour;
        System.out.printf("%.2f", totalPrice);
    }
}

