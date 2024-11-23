import java.util.Scanner;

public class OddEvenPosition_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double oddSum = 0;
        double evenSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double num = sc.nextDouble();

            if (i % 2 == 0) {
                evenSum += num;
                if (num < evenMin) evenMin = num;
                if (num > evenMax) evenMax = num;
            } else {
                oddSum += num;
                if (num < oddMin) oddMin = num;
                if (num > oddMax) oddMax = num;
            }
        }
        if (n == 0) {
            System.out.printf("OddSum=%.2f,\nOddMin=No,\nOddMax=No,\nEvenSum=%.2f,\nEvenMin=No,\nEvenMax=No",
                    oddSum, evenSum);
        } else if (n == 1) {
            System.out.printf("OddSum=%.2f,\nOddMin=%.2f,\nOddMax=%.2f,\nEvenSum=%.2f,\nEvenMin=No,\nEvenMax=No",
                    oddSum, oddMin, oddMax, evenSum);
        } else {
            System.out.printf("OddSum=%.2f,\nOddMin=%.2f,\nOddMax=%.2f,\nEvenSum=%.2f,\nEvenMin=%.2f,\nEvenMax=%.2f\n",
                    oddSum, oddMin, oddMax, evenSum, evenMin, evenMax);
        }
    }
}
