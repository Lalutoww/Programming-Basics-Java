import java.util.Scanner;

public class SquareFrame_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                System.out.print("+ ");
                for (int col = 1; col <= n - 2; col++) {
                    System.out.print("- ");
                }
                System.out.println("+");
            } else {
                System.out.print("| ");
                for (int col = 1; col <= n - 2; col++) {
                    System.out.print("- ");
                }
                System.out.println("|");
            }
        }
    }
}
