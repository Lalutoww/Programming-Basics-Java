import java.util.Scanner;

public class EvenOrOdd_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(result);
    }
}
