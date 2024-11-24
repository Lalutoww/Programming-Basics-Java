import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int failsNeeded = Integer.parseInt(sc.nextLine());
        int failsCount = 0;
        String taskName = sc.nextLine();
        boolean hasFailed = false;

        double averageScore = 0;
        int tasksDone = 0;
        String lastTaskName = "";

        while (!taskName.equals("Enough")) {
            lastTaskName = taskName;
            double taskGrade = Double.parseDouble(sc.nextLine());

            if (taskGrade <= 4) failsCount++;
            if (failsCount == failsNeeded) {
                hasFailed = true;
                break;
            }
            averageScore += taskGrade;
            tasksDone++;

            taskName = sc.nextLine();
        }

        if (hasFailed) {
            System.out.printf("You need a break, %d poor grades.", failsCount);
        } else {
            System.out.printf("Average score: %.2f\n", averageScore / tasksDone);
            System.out.printf("Number of problems: %d\n", tasksDone);
            System.out.printf("Last problem: %s", lastTaskName);
        }
    }
}
