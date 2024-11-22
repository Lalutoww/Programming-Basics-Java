import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double occupiedPercent = Double.parseDouble(scan.nextLine());

        double volumeInCubicDecimeters = (length * width * height) / 1000.0;
        double neededLiters = volumeInCubicDecimeters * (1 - occupiedPercent / 100);

        System.out.println(neededLiters);

    }
}
