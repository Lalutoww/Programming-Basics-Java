import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        final double CHICKEN_MENU_PRICE = 10.35;
        final double FISH_MENU_PRICE = 12.40;
        final double VEGETARIAN_MENU_PRICE = 8.15;
        final double DELIVERY_PRICE = 2.50;

        Scanner scan = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(scan.nextLine());
        int fishMenus = Integer.parseInt(scan.nextLine());
        int vegetarianMenus = Integer.parseInt(scan.nextLine());

        double totalMenusPrice = chickenMenus * CHICKEN_MENU_PRICE + fishMenus * FISH_MENU_PRICE + vegetarianMenus * VEGETARIAN_MENU_PRICE;
        double totalPrice = totalMenusPrice + totalMenusPrice * 0.2 + DELIVERY_PRICE;

        System.out.println(totalPrice);
    }
}
