import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vineyardLength = sc.nextInt();
        double grapesPerSquareMeter = sc.nextDouble();
        int litersWineNeeded = sc.nextInt();
        int workers = sc.nextInt();

        double totalGrapes = vineyardLength * grapesPerSquareMeter;
        double litersWine = totalGrapes * 0.4 / 2.5;

        double wineLeft = Math.abs(litersWine - litersWineNeeded);

        if (litersWine < litersWineNeeded) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineLeft));
        } else {
            double litersPerWorker = wineLeft / workers;

            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(litersWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(litersPerWorker));
        }
    }
}
