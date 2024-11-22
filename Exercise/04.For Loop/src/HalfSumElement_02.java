import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;

            if (num > max) max = num;
        }

        int sumWithoutMax = sum - max;
        if (max == sumWithoutMax) System.out.printf("Yes\nSum = %d", max);
        else System.out.printf("No\nDiff = %d", Math.abs(max - sumWithoutMax));
    }
}
