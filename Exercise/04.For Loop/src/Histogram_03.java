import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            if (number < 200) count1++;
            else if (number <= 399) count2++;
            else if (number <= 599) count3++;
            else if (number <= 799) count4++;
            else count5++;
        }

        double p1 = (double) count1 / n * 100;
        double p2 = (double) count2 / n * 100;
        double p3 = (double) count3 / n * 100;
        double p4 = (double) count4 / n * 100;
        double p5 = (double) count5 / n * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", p1, p2, p3, p4, p5);
    }
}
