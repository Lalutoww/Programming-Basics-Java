import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examHour = sc.nextInt();
        int examMinute = sc.nextInt();
        int arrivalHour = sc.nextInt();
        int arrivalMinute = sc.nextInt();

        int examTimeInMinutes = examHour * 60 + examMinute;
        int arrivalTimeInMinutes = arrivalHour * 60 + arrivalMinute;

        int timeLeft = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);
        int hours, minutes;

        if (examTimeInMinutes > arrivalTimeInMinutes && timeLeft <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", timeLeft);
        } else if (examTimeInMinutes == arrivalTimeInMinutes) {
            System.out.println("On time");
        } else if (examTimeInMinutes > arrivalTimeInMinutes && timeLeft <= 59) {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", timeLeft);
        } else if (examTimeInMinutes > arrivalTimeInMinutes && timeLeft >= 60) {
            System.out.println("Early");
            hours = timeLeft / 60;
            minutes = timeLeft % 60;
            if (minutes < 10) System.out.printf("%d:0%d hours before the start", hours, minutes);
            else System.out.printf("%d:%d hours before the start", hours, minutes);
        } else if (examTimeInMinutes < arrivalTimeInMinutes && timeLeft <= 59) {
            System.out.println("Late");
            System.out.printf("%d minutes after the start", timeLeft);
        } else {
            System.out.println("Late");
            hours = timeLeft / 60;
            minutes = timeLeft % 60;
            if (minutes < 10) System.out.printf("%d:0%d hours after the start", hours, minutes);
            else System.out.printf("%d:%d hours after the start", hours, minutes);
        }
    }
}
