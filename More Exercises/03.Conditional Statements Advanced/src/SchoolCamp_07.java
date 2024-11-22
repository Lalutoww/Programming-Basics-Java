import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String season = sc.next().toLowerCase();
        String groupType = sc.next().toLowerCase();
        int studentsCount = sc.nextInt();
        int nights = sc.nextInt();

        double pricePerNight = 0;
        switch (groupType) {
            case "boys", "girls" -> {
                pricePerNight = switch (season) {
                    case "winter" -> 9.60;
                    case "spring" -> 7.20;
                    case "summer" -> 15;
                    default -> 0;
                };
            }
            case "mixed" -> {
                pricePerNight = switch (season) {
                    case "winter" -> 10;
                    case "spring" -> 9.50;
                    case "summer" -> 20;
                    default -> 0;
                };
            }
        }

        double totalPrice = nights * pricePerNight * studentsCount;
        if (studentsCount >= 10 && studentsCount < 20) totalPrice *= 0.95;
        else if (studentsCount >= 20 && studentsCount < 50) totalPrice *= 0.85;
        else if (studentsCount >= 50) totalPrice *= 0.50;

        String sport = "";
        switch (groupType) {
            case "girls" -> {
                sport = switch (season) {
                    case "winter" -> "Gymnastics";
                    case "spring" -> "Athletics";
                    case "summer" -> "Volleyball";
                    default -> "error";
                };
            }
            case "boys" -> {
                sport = switch (season) {
                    case "winter" -> "Judo";
                    case "spring" -> "Tennis";
                    case "summer" -> "Football";
                    default -> "error";
                };
            }
            case "mixed" -> {
                sport = switch (season) {
                    case "winter" -> "Ski";
                    case "spring" -> "Cycling";
                    case "summer" -> "Swimming";
                    default -> "error";
                };
            }
        }

        System.out.printf("%s %.2f lv.", sport, totalPrice);

    }
}
