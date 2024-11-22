import java.util.Scanner;

public class OddEvenSum_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();

            if (i % 2 == 0) sum1 += number;
            else sum2 += number;
        }

        if (sum1 == sum2) System.out.printf("Yes\nSum = %d", sum1);
        else System.out.printf("No\nDiff = %d", Math.abs(sum1 - sum2));
    }
}
