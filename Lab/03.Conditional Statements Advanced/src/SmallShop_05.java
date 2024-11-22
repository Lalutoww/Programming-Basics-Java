import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.next();
        String city = sc.next();
        double quantity = sc.nextDouble();

        double totalPrice;

        switch (city){
            case "Sofia" -> {
                totalPrice = switch (product) {
                    case "coffee" -> quantity * 0.50;
                    case "water" -> quantity * 0.80;
                    case "beer" ->  quantity * 1.20;
                    case "sweets" -> quantity * 1.45;
                    case "peanuts" -> quantity * 1.60;
                    default -> 0.00;
                };
            }
            case "Plovdiv" -> {
                totalPrice = switch (product){
                    case "coffee" -> quantity * 0.40;
                    case "water" -> quantity * 0.70;
                    case "beer" -> quantity * 1.15;
                    case "sweets" -> quantity * 1.30;
                    case "peanuts" -> quantity * 1.50;
                    default -> 0.00;
                };
            }
            case "Varna" -> {
                totalPrice = switch (product) {
                    case "coffee" -> quantity * 0.45;
                    case "water" -> quantity * 0.70;
                    case "beer" -> quantity * 1.10;
                    case "sweets" -> quantity * 1.35;
                    case "peanuts" -> quantity * 1.55;
                    default -> 0.00;
                };
            }
            default -> totalPrice = 0.00;
        }

        System.out.println(totalPrice);
    }
}
