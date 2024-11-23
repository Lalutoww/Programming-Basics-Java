import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stadiumCapacity = sc.nextInt();
        int totalFans = sc.nextInt();

        int countA = 0, countB = 0, countV = 0, countG = 0;
        for (int i = 0; i < totalFans; i++) {
            char sector = sc.next().charAt(0);

            switch (sector) {
                case 'A' -> countA++;
                case 'B' -> countB++;
                case 'V' -> countV++;
                case 'G' -> countG++;
            }
        }

        double aPercent = (double) countA / totalFans * 100;
        double bPercent = (double) countB / totalFans * 100;
        double vPercent = (double) countV / totalFans * 100;
        double gPercent = (double) countG / totalFans * 100;
        double fanPercent = (double) totalFans / stadiumCapacity * 100;

        System.out.printf("%.2f%%\n", aPercent);
        System.out.printf("%.2f%%\n", bPercent);
        System.out.printf("%.2f%%\n", vPercent);
        System.out.printf("%.2f%%\n", gPercent);
        System.out.printf("%.2f%%", fanPercent);
    }
}
