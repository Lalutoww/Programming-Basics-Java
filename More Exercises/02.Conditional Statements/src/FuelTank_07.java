import java.util.Scanner;

public class FuelTank_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fuelTypeInput = sc.next();
        double fuelLiters = sc.nextDouble();
        String fuelType;

        switch (fuelTypeInput) {
            case "Diesel": fuelType = "diesel"; break;
            case "Gasoline": fuelType = "gasoline"; break;
            case "Gas": fuelType = "gas"; break;
            default: System.out.println("Invalid fuel!"); return;
        }

        if (fuelLiters >= 25) System.out.printf("You have enough %s.", fuelType);
        else System.out.printf("Fill your tank with %s!", fuelType);
    }
}
