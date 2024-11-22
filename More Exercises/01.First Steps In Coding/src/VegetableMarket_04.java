import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vegetablePricePerKG = Double.parseDouble(scan.nextLine());
        double fruitPricePerKG = Double.parseDouble(scan.nextLine());
        int vegetableKGs = Integer.parseInt(scan.nextLine());
        int fruitKGs = Integer.parseInt(scan.nextLine());

        double totalPriceInBGN = vegetableKGs * vegetablePricePerKG + fruitKGs * fruitPricePerKG;
        double totalPriceInEUR = totalPriceInBGN / 1.94;

        System.out.printf("%.2f", totalPriceInEUR);

    }
}
