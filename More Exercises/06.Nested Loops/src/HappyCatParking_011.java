import java.util.Scanner;

public class HappyCatParking_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 1; i <= days; i++) {
            double dayTotal = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) dayTotal += 2.50;
                else if (i % 2 != 0 && j % 2 == 0) dayTotal += 1.25;
                else dayTotal += 1;
            }
            total += dayTotal;
            System.out.printf("Day: %d - %.2f leva%n", i, dayTotal);
        }
        System.out.printf("Total: %.2f leva%n", total);
    }
}
