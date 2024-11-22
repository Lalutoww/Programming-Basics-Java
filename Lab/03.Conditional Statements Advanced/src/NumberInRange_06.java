import java.util.Scanner;

public class NumberInRange_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String output;

        if (number >= -100 && number <= 100 && number != 0) output = "Yes";
        else output = "No";

        System.out.println(output);
    }
}
