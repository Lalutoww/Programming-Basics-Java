import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double annualTax = Double.parseDouble(scan.nextLine());
        double shoesPrice = annualTax - annualTax * 0.4;
        double clothesPrice = shoesPrice - shoesPrice * 0.2;
        double basketballPrice = clothesPrice / 4;
        double accessoriesPrice = basketballPrice / 5;

        double totalPrice = annualTax + shoesPrice + clothesPrice + basketballPrice + accessoriesPrice;

        System.out.println(totalPrice);
    }
}
