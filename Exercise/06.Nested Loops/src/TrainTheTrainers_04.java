import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String presentation = sc.nextLine();
        double totalGrade = 0;
        int counter = 0;

        while (!presentation.equals("Finish")) {
            double gradeSum = 0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(sc.nextLine());
                gradeSum += grade;
                totalGrade += grade;
                counter++;
            }
            double averageGrade = gradeSum / n;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);
            presentation = sc.nextLine();
        }
        double finalGrade = totalGrade / counter;
        System.out.printf("Student's final assessment is %.2f.%n", finalGrade);
    }
}
