import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double totalPoints = 0;
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();

            if (number >= 0 && number <= 9) {
                count1++;
                totalPoints += number * 0.20;
            } else if (number >= 10 && number <= 19) {
                count2++;
                totalPoints += number * 0.30;
            } else if (number >= 20 && number <= 29) {
                count3++;
                totalPoints += number * 0.40;
            } else if (number >= 30 && number <= 39) {
                count4++;
                totalPoints += 50;
            } else if (number >= 40 && number <= 50) {
                count5++;
                totalPoints += 100;
            } else {
                count6++;
                totalPoints /= 2;
            }
        }
        double p1 = (double) count1 / n * 100;
        double p2 = (double) count2 / n * 100;
        double p3 = (double) count3 / n * 100;
        double p4 = (double) count4 / n * 100;
        double p5 = (double) count5 / n * 100;
        double p6 = (double) count6 / n * 100;
        System.out.printf("%.2f\n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%\n", p1);
        System.out.printf("From 10 to 19: %.2f%%\n", p2);
        System.out.printf("From 20 to 29: %.2f%%\n", p3);
        System.out.printf("From 30 to 39: %.2f%%\n", p4);
        System.out.printf("From 40 to 50: %.2f%%\n", p5);
        System.out.printf("Invalid numbers: %.2f%%", p6);
    }
}
