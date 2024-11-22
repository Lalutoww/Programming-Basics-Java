import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        String day = sc.next();
        String output;

        if(hour >= 10 && hour <= 18 && !day.equals("Sunday")) output = "open";
        else output = "closed";

        System.out.println(output);
    }
}
