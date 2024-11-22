import java.util.Scanner;

public class MultiplyByTwo_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        while (num >= 0) {
            num = num * 2;
            System.out.printf("Result: %.2f\n", num);
            num = sc.nextDouble();
        }

        if (num < 0) System.out.println("Negative number!");
    }
}
