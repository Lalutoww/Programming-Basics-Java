import java.util.Scanner;

public class TimePlus15Min_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        minutes+=15;

        if(minutes >= 60){
            minutes %=60;
            hours++;

            if(hours >= 24) hours = 0;
        }

        if(minutes < 10) System.out.printf("%d:0%d", hours, minutes);
        else System.out.printf("%d:%d", hours, minutes);
    }
}
