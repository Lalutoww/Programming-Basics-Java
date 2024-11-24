import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        final int STEPS_NEEDED = 10000;
        Scanner sc = new Scanner(System.in);

        int totalSteps = 0;
        while (totalSteps < STEPS_NEEDED) {
            String input = sc.nextLine();
            if (!input.equals("Going home")) {
                int steps = Integer.parseInt(input);
                totalSteps += steps;
            } else {
                int stepsToHome = Integer.parseInt(sc.nextLine());
                totalSteps += stepsToHome;
                break;
            }
        }
        int stepsLeft = Math.abs(totalSteps - STEPS_NEEDED);
        if (totalSteps >= STEPS_NEEDED)
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", stepsLeft);
        else System.out.printf("%d more steps to reach goal.", stepsLeft);
    }
}
