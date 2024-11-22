import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inheritance = sc.nextDouble();
        int year = sc.nextInt();

        double moneyLeft = inheritance;
        int personYears = 18;
        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) moneyLeft -= 12000;
            else moneyLeft -= (12000 + personYears * 50);
            personYears++;
        }

        if (moneyLeft >= 0)
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);
        else System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyLeft));
    }
}
