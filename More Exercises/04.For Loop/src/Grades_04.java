import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        double averageGrade = 0;
        for (int i = 0; i < students; i++) {
            double grade = sc.nextDouble();

            if (grade >= 5.00) count1++;
            else if (grade >= 4.00) count2++;
            else if (grade >= 3.00) count3++;
            else count4++;

            averageGrade += grade;
        }

        averageGrade /= students;
        double p1 = (double) count1 / students * 100;
        double p2 = (double) count2 / students * 100;
        double p3 = (double) count3 / students * 100;
        double p4 = (double) count4 / students * 100;

        System.out.printf("Top students: %.2f%%\n", p1);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", p2);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", p3);
        System.out.printf("Fail: %.2f%%\n", p4);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
