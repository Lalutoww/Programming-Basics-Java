import java.util.Scanner;

public class SpeedInfo_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();
        String output;

        if (speed <= 10) output = "slow";
        else if (speed <= 50) output = "average";
        else if (speed <= 150) output = "fast";
        else if (speed <= 1000) output = "ultra fast";
        else output = "extremely fast";

        System.out.println(output);
    }

}
