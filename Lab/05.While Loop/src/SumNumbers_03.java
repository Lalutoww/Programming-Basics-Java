import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        while (sum < n) {
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
