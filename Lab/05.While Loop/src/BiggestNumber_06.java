import java.util.Scanner;

public class BiggestNumber_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int biggestNumber = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number > biggestNumber) biggestNumber = number;
            input = sc.nextLine();
        }

        System.out.println(biggestNumber);
    }
}
