import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = sc.nextDouble();
        String season = sc.next().toLowerCase();

        String place = "";
        String location = "";
        if (budget <= 1000) {
            place = "Camp";
            switch (season) {
                case "summer" -> {
                    location = "Alaska";
                    budget *= 0.65;
                }
                case "winter" -> {
                    location = "Morocco";
                    budget *= 0.45;
                }
            }
        } else if (budget > 1000 && budget <= 3000) {
            place = "Hut";
            switch (season) {
                case "summer" -> {
                    location = "Alaska";
                    budget *= 0.80;
                }
                case "winter" -> {
                    location = "Morocco";
                    budget *= 0.60;
                }
            }
        } else if (budget > 3000) {
            place = "Hotel";
            switch (season) {
                case "summer" -> {
                    location = "Alaska";

                }
                case "winter" -> {
                    location = "Morocco";
                }
            }
            budget *= 0.90;
        }

        System.out.printf("%s - %s - %.2f", location, place, budget);
    }
}
