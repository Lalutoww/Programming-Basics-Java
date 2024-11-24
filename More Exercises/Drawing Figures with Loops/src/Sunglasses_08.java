import java.util.Scanner;

public class Sunglasses_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String frame = "";
        String frame1 = "|";

        System.out.println("*".repeat(2 * n) + " ".repeat(n) + "*".repeat(2 * n));

        for (int row = 1; row <= n - 2; row++) {
            if (n % 2 == 1 && row == (n - 1) / 2) {
                frame = frame1.repeat(n);
            } else if (n % 2 == 0 && row == n / 2 - 1) {
                frame = frame1.repeat(n);
            } else {
                frame = " ".repeat(n);
            }
            System.out.println("*" + "/".repeat(2 * n - 2) + "*" + frame + "*" + "/".repeat(2 * n - 2) + "*");
        }

        System.out.println("*".repeat(2 * n) + " ".repeat(n) + "*".repeat(2 * n));
    }
}
