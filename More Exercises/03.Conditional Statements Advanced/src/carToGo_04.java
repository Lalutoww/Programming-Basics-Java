import java.util.Scanner;

public class carToGo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = sc.nextDouble();
        String season = sc.next().toLowerCase();

        String carClass = "";
        String carType = "";
        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "summer" -> {
                    carType = "Cabrio";
                    budget *= 0.35;
                }
                case "winter" -> {
                    carType = "Jeep";
                    budget *= 0.65;
                }
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "summer" -> {
                    carType = "Cabrio";
                    budget *= 0.45;
                }
                case "winter" -> {
                    carType = "Jeep";
                    budget *= 0.80;
                }
            }
        } else if (budget > 500) {
            carClass = "Luxury class";
            carType = "Jeep";
            budget *= 0.90;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, budget);
    }
}
