import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double record = sc.nextDouble();
        double distance = sc.nextDouble();
        double secondsForMeter = sc.nextDouble();

        double neededSeconds = distance * secondsForMeter;
        double resistanceSeconds = Math.floor(distance / 15) * 12.5;
        double totalTime = neededSeconds + resistanceSeconds;

        double timeLeft = record - totalTime;

        if (timeLeft > 0) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(timeLeft));
    }
}
