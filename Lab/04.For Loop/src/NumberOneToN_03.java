import java.util.Scanner;

public class NumberOneToN_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 3) System.out.println(i);
    }
}
