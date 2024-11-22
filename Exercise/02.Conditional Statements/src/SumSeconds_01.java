import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time1 = sc.nextInt();
        int time2 = sc.nextInt();
        int time3 = sc.nextInt();

        int totalSeconds = time1 + time2 + time3;
        int minutes = totalSeconds / 60;
        int secondsLeft = totalSeconds % 60;

        if (secondsLeft < 10) {
            System.out.printf("%d:0%d", minutes, secondsLeft);
        } else System.out.printf("%d:%d", minutes, secondsLeft);
    }
}
