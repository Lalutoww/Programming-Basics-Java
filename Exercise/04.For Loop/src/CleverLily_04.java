import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double washerPrice = sc.nextDouble();
        double toyPrice = sc.nextDouble();

        double moneySaved = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) moneySaved += (i * 5) - 1;
            else moneySaved += toyPrice;
        }

        if (moneySaved >= washerPrice) System.out.printf("Yes! %.2f", moneySaved - washerPrice);
        else System.out.printf("No! %.2f", washerPrice - moneySaved);
    }
}
