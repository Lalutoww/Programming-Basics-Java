import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();

            if (number > maxNumber) maxNumber = number;
            if (number < minNumber) minNumber = number;
        }

        System.out.printf("Max number: %d\n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
