import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int num = i;
            boolean isSpecial = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || n % digit != 0) {
                    isSpecial = false;
                    break;
                }
                num /= 10;
            }
            if (isSpecial) System.out.print(i + " ");
        }
    }
}
