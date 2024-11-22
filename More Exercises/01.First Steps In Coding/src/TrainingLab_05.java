import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double areaLeftForSeats = h * 100 - 100;
        double seatsPerRow = Math.floor(areaLeftForSeats / 70);
        double areaForRows = w * 100;
        double rows = Math.floor(areaForRows / 120);

        double totalPlaces = seatsPerRow * rows - 3;
        System.out.printf("%d", Math.round(totalPlaces));
    }
}
