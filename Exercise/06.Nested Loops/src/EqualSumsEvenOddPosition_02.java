import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        for (int i = num1; i <= num2; i++) {
            int evenSum = 0;
            int oddSum = 0;
            String num = Integer.toString(i);
            for (int j = 0; j < num.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(num.charAt(j)));
                if (j % 2 == 0) evenSum += digit;
                else oddSum += digit;
            }
            if (evenSum == oddSum) System.out.print(i + " ");
        }
    }
}
