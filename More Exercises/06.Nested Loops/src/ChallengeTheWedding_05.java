import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maleGuestCount = Integer.parseInt(sc.nextLine());
        int femaleGuestCount = Integer.parseInt(sc.nextLine());
        int maxTables = Integer.parseInt(sc.nextLine());
        int tableCount = 0;

        for (int i = 1; i <= maleGuestCount; i++) {
            for (int j = 1; j <= femaleGuestCount; j++) {
                if (tableCount == maxTables) break;
                System.out.printf("(%d <-> %d) ", i, j);
                tableCount++;
            }
        }

    }
}
