import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int failedCount = 0;
        int studentClass = 1;
        double averageGrade = 0;

        while (studentClass <= 12) {
            double grade = sc.nextDouble();

            if (grade >= 4.00) averageGrade += grade;
            else failedCount++;

            if (failedCount >= 2) break;

            studentClass++;
        }
        if (studentClass >= 12) System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade / 12);
        else System.out.printf("%s has been excluded at %d grade", name, studentClass - 1);
    }
}
