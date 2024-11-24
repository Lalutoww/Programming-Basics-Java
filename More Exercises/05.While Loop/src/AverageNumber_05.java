import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        double average = (double) sum / n;
        System.out.printf("%.2f", average);
    }
}
