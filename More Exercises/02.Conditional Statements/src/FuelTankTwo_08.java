import java.util.Scanner;

public class FuelTankTwo_08 {
    public static void main(String[] args) {
        double gasolinePrice = 2.22;
        double dieselPrice = 2.33;
        double gasPrice = 0.93;

        Scanner sc = new Scanner(System.in);
        String fuelTypeInput = sc.next();
        double fuelLiters = sc.nextDouble();
        String clubCard = sc.next();

        if (clubCard.equals("Yes")) {
            gasolinePrice -= 0.18;
            dieselPrice -= 0.12;
            gasPrice -= 0.08;
        }

        double finalPrice = 0;
        switch (fuelTypeInput) {
            case "Diesel": {
                finalPrice = fuelLiters * dieselPrice;
            }
            break;
            case "Gasoline": {
                finalPrice = fuelLiters * gasolinePrice;
            }
            break;
            case "Gas": {
                finalPrice = fuelLiters * gasPrice;
            }
            break;
        }

        if (fuelLiters >= 20 && fuelLiters <= 25) finalPrice *= 0.92;
        else if (fuelLiters > 25) finalPrice *= 0.90;

        System.out.printf("%.2f lv.", finalPrice);
    }
}
