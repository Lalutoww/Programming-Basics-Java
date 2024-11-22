import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        final int ALLOWED_PLAYTIME_IN_MINUTES = 30000;

        Scanner sc = new Scanner(System.in);
        int restDays = sc.nextInt();
        int workDays = 365 - restDays;
        int playTimeInMinutes = workDays * 63 +  restDays * 127;
        int minutesLeft = Math.abs(ALLOWED_PLAYTIME_IN_MINUTES - playTimeInMinutes);

        double hours = Math.floor(minutesLeft/60);
        double minutes = minutesLeft%60;

        if(ALLOWED_PLAYTIME_IN_MINUTES <  playTimeInMinutes){
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", hours, minutes);
        }else{
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours, minutes);
        }

    }
}
