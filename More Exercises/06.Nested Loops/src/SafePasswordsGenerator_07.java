import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int maxPasswords = Integer.parseInt(sc.nextLine());
        int counter = 0;
        char A = 35;
        char B = 64;
        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                A++;
                B++;
                counter++;
                if (A > 55) {
                    A = 35;
                }
                if (B > 96) {
                    B = 64;
                }
                if (counter == maxPasswords) {
                    return;
                }
            }
        }
    }
}
