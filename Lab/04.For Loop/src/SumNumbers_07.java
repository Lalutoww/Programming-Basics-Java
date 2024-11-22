import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println(sum);
    }
}
