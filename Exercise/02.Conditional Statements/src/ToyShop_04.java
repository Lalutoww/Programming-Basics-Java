import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        final double PUZZLE_PRICE = 2.60;
        final double DOLL_PRICE = 3.00;
        final double TEDDY_BEAR_PRICE = 4.10;
        final double MINION_PRICE = 8.20;
        final double TRUCK_PRICE = 2.00;

        Scanner sc = new Scanner(System.in);
        double vacationPrice = sc.nextDouble();
        int puzzleQuantity = sc.nextInt();
        int dollQuantity = sc.nextInt();
        int teddyBearQuantity = sc.nextInt();
        int minionQuantity = sc.nextInt();
        int truckQuantity = sc.nextInt();

        double totalMoneyEarned = puzzleQuantity * PUZZLE_PRICE + dollQuantity * DOLL_PRICE + teddyBearQuantity * TEDDY_BEAR_PRICE + minionQuantity * MINION_PRICE + truckQuantity * TRUCK_PRICE;

        int totalToysOrdered = puzzleQuantity + dollQuantity + teddyBearQuantity + minionQuantity + truckQuantity;

        if (totalToysOrdered >= 50){
            totalMoneyEarned *= 0.75;
        }

        //10% of money goes for rent
        totalMoneyEarned*=0.90;

        double moneyLeft = totalMoneyEarned - vacationPrice;
        if(moneyLeft >= 0){
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft));
        }
    }
}
