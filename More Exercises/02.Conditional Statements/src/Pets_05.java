import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int foodInKG = sc.nextInt();
        double dogFoodNeededInKG = sc.nextDouble();
        double catFoodNeededInKG = sc.nextDouble();
        double turtleFoodNeededInG = sc.nextDouble();

        double totalFoodNeeded = dogFoodNeededInKG * days + catFoodNeededInKG * days + (turtleFoodNeededInG / 1000) * days;
        double foodLeftInKG = Math.abs(foodInKG - totalFoodNeeded);

        if (foodInKG >= totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeftInKG));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodLeftInKG));
        }
    }
}
