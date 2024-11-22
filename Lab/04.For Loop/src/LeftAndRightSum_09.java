import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < 2 * n; i++) {
            int number = sc.nextInt();

            if (i < n) sum1 += number;
            else sum2 += number;
        }

        if (sum1 == sum2) System.out.printf("Yes, sum = %d", sum1);
        else System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
    }
}
