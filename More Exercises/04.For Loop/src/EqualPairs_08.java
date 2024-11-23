import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lastSum = 0;
        int diff = 0;

        for (int i = 0; i < n; i++) {

            int first = sc.nextInt();
            int second = sc.nextInt();
            int sum = first + second;

            if (i > 0) {
                diff = Math.abs(lastSum - sum);
            }
            lastSum = sum;
        }

        if (diff == 0) System.out.printf("Yes, value=%s", lastSum);
        else System.out.printf("No, maxdiff=%s", diff);
    }
}
