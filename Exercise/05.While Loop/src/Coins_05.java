import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double change = sc.nextDouble();
        change = Math.floor(change * 100);
        int coinsNeeded = 0;

        while (change > 0) {
            if (change >= 200) {
                change -= 200;
                coinsNeeded++;
            } else if (change >= 100) {
                change -= 100;
                coinsNeeded++;
            } else if (change >= 50) {
                change -= 50;
                coinsNeeded++;
            } else if (change >= 20) {
                change -= 20;
                coinsNeeded++;
            } else if (change >= 10) {
                change -= 10;
                coinsNeeded++;
            } else if (change >= 5) {
                change -= 5;
                coinsNeeded++;
            } else if (change >= 2) {
                change -= 2;
                coinsNeeded++;
            } else {
                change -= 1;
                coinsNeeded++;
            }
        }
        System.out.println(coinsNeeded);
    }
}
