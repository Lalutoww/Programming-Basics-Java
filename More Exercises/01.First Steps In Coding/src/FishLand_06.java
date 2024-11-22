import java.util.Scanner;

public class FishLand_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scan.nextLine());
        double spratPrice = Double.parseDouble(scan.nextLine());
        double bonitoKGs = Double.parseDouble(scan.nextLine());
        double whitefishKGs = Double.parseDouble(scan.nextLine());
        int clamKGs = Integer.parseInt(scan.nextLine());

        double bonitoPrice = mackerelPrice * 1.6;
        double whitefishPrice = spratPrice * 1.8;

        double totalPrice = bonitoKGs * bonitoPrice + whitefishPrice * whitefishKGs + clamKGs * 7.50;
        System.out.printf("%.2f", totalPrice);
    }
}
