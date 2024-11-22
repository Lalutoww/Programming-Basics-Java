import java.util.Scanner;

public class FruitShop_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();
        String day = sc.next();
        double quantity = sc.nextDouble();

        double totalPrice;
        String output;

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                totalPrice = switch (fruit) {
                    case "banana" -> quantity * 2.50;
                    case "apple" -> quantity * 1.20;
                    case "orange" -> quantity * 0.85;
                    case "grapefruit" -> quantity * 1.45;
                    case "kiwi" -> quantity * 2.70;
                    case "pineapple" -> quantity * 5.50;
                    case "grapes" -> quantity * 3.85;
                    default -> 0.00;
                };
            }
            case "Saturday", "Sunday" -> {
                totalPrice = switch (fruit) {
                    case "banana" -> quantity * 2.70;
                    case "apple" -> quantity * 1.25;
                    case "orange" -> quantity * 0.90;
                    case "grapefruit" -> quantity * 1.60;
                    case "kiwi" -> quantity * 3.00;
                    case "pineapple" -> quantity * 5.60;
                    case "grapes" -> quantity * 4.20;
                    default -> 0.00;
                };
            }
            default -> totalPrice = 0.00;
        }

        if (totalPrice == 0.00) System.out.println("error");
        else System.out.printf("%.2f", totalPrice);
    }
}
