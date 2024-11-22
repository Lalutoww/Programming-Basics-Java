import java.util.Scanner;

public class ZooShop_08 {
    public static void main(String[] args) {
        final double DOG_FOOD_PRICE = 2.5;
        final double CAT_FOOD_PRICE = 4.0;

        Scanner scan = new Scanner(System.in);
        int dogFood = Integer.parseInt(scan.nextLine());
        int catFood = Integer.parseInt(scan.nextLine());

        double totalPrice = dogFood * DOG_FOOD_PRICE + catFood * CAT_FOOD_PRICE;

        System.out.printf("%.1f lv.", totalPrice);

    }
}
