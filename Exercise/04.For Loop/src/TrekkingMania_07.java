import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = sc.nextInt();

        int totalPeople = 0;
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        for (int i = 0; i < groups; i++) {
            int peopleInGroup = sc.nextInt();
            totalPeople += peopleInGroup;

            if (peopleInGroup <= 5) count1+=peopleInGroup;
            else if (peopleInGroup <= 12) count2+=peopleInGroup;
            else if (peopleInGroup <= 25) count3+=peopleInGroup;
            else if (peopleInGroup <= 40) count4+=peopleInGroup;
            else count5+=peopleInGroup;
        }
        double p1 = (double) count1 / totalPeople * 100;
        double p2 = (double) count2 / totalPeople * 100;
        double p3 = (double) count3 / totalPeople * 100;
        double p4 = (double) count4 / totalPeople * 100;
        double p5 = (double) count5 / totalPeople * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", p1, p2, p3, p4, p5);

    }
}
