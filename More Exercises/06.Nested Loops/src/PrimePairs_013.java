import java.util.Scanner;

public class PrimePairs_013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startFirstPair = Integer.parseInt(sc.nextLine());
        int startSecondPair = Integer.parseInt(sc.nextLine());
        int diffFirstPair = Integer.parseInt(sc.nextLine());
        int diffSecondPair = Integer.parseInt(sc.nextLine());

        int endFirstPair = startFirstPair + diffFirstPair;
        int endSecondPair = startSecondPair + diffSecondPair;

        for (int i = startFirstPair; i <= endFirstPair; i++) {
            for (int j = startSecondPair; j <= endSecondPair; j++) {
                boolean isPrimeFirst = true;
                boolean isPrimeSecond = true;
                for (int k = 2; k <= Math.sqrt(i); k++) {
                    if (i % k == 0) {
                        isPrimeFirst = false;
                        break;
                    }
                }
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        isPrimeSecond = false;
                        break;
                    }
                }
                if (isPrimeFirst && isPrimeSecond) {
                    System.out.printf("%d%d\n", i, j);
                }
            }
        }
    }
}
