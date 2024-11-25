import java.util.Scanner;

public class UniquePinCodes_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        for (int i = 2; i <= n1; i++) {
            if (i % 2 == 0) {
                for (int j = 2; j <= n2; j++) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        for (int k = 2; k <= n3; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, j, k);
                            }
                        }
                    }
                }
            }
        }
    }
}
