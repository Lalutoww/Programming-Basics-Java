import java.util.Scanner;

public class Profit_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oneLev = Integer.parseInt(sc.nextLine());
        int twoLev = Integer.parseInt(sc.nextLine());
        int fiveLev = Integer.parseInt(sc.nextLine());
        int sum = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= oneLev; i++) {
            for (int j = 0; j <= twoLev; j++) {
                for (int k = 0; k <= fiveLev; k++) {
                    if (i + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
