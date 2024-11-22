import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        sc.nextLine();
        int nights = days - 1;
        String roomType = sc.nextLine();
        String rating = sc.next();

        // prices are for one night (2 days = 1 night)
        final double ROOM_PRICE = 18.00;
        final double APARTMENT_PRICE = 25.00;
        final double PRESIDENT_APARTMENT_PRICE = 35.00;

        double totalPrice;
        switch (roomType) {
            case "room for one person" -> totalPrice = ROOM_PRICE * nights;
            case "apartment" -> {
                totalPrice = APARTMENT_PRICE * nights;
                if (days < 10) totalPrice *= 0.70;
                else if (days >= 10 && days <= 15) totalPrice *= 0.65;
                else totalPrice *= 0.50;
            }
            case "president apartment" -> {
                totalPrice = PRESIDENT_APARTMENT_PRICE * nights;
                if (days < 10) totalPrice *= 0.90;
                else if (days >= 10 && days <= 15) totalPrice *= 0.85;
                else totalPrice *= 0.80;
            }
            default -> totalPrice = 0;
        }

        totalPrice *= switch (rating) {
            case "positive" -> 1.25;
            case "negative" -> 0.90;
            default -> 0;
        };

        System.out.printf("%.2f", totalPrice);

    }
}
