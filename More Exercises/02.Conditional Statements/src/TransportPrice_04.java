import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        final double STARTING_TAXI_PRICE = 0.70;

        Scanner sc = new Scanner(System.in);
        int kilometers = sc.nextInt();
        String timeOfDay = sc.next();

        double taxiFare, busFare = 10000000, trainFare = 10000000;

        if (timeOfDay.equals("day")) taxiFare = STARTING_TAXI_PRICE + kilometers * 0.79;
        else taxiFare = STARTING_TAXI_PRICE + kilometers * 0.90;

        if (kilometers >= 20 && kilometers < 100) {
            busFare = kilometers * 0.09;
        } else if (kilometers >= 100) {
            trainFare = kilometers * 0.06;
        }

        double bestFare = Math.min(Math.min(taxiFare, busFare), trainFare);

        System.out.printf("%.2f", bestFare);
    }
}
