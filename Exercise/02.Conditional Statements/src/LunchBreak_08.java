import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seriesName = sc.nextLine();
        double seriesLength = sc.nextDouble();
        double rest = sc.nextDouble();

        double lunchTime = rest / 8;
        double chillTime = rest / 4;
        double restLeft = rest - (chillTime + lunchTime);
        double timeLeft = restLeft - seriesLength;

        if (timeLeft >= 0)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(timeLeft));
        else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(Math.abs(timeLeft)));


    }
}
