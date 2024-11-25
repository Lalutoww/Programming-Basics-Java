import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
                if (num > n) break;
            }
            System.out.println();
            if (num > n) break;
        }
    }
}
