import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loads = sc.nextInt();

        int totalTons = 0;
        double averagePricePerTon = 0;
        int busTons = 0, truckTons = 0, trainTons = 0;
        for (int i = 0; i < loads; i++) {
            int tons = sc.nextInt();
            totalTons += tons;

            if (tons <= 3) {
                busTons += tons;
                averagePricePerTon += tons * 200;
            } else if (tons <= 11) {
                truckTons += tons;
                averagePricePerTon += tons * 175;
            } else {
                trainTons += tons;
                averagePricePerTon += tons * 120;
            }


        }
        averagePricePerTon /= totalTons;
        double p1 = (double) busTons / totalTons * 100;
        double p2 = (double) truckTons / totalTons * 100;
        double p3 = (double) trainTons / totalTons * 100;

        System.out.printf("%.2f\n", averagePricePerTon);
        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);


    }
}
