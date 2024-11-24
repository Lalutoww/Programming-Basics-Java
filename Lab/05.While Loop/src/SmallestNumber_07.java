import java.util.Scanner;

public class SmallestNumber_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int smallestNumber = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number < smallestNumber) smallestNumber = number;
            input = sc.nextLine();
        }

        System.out.println(smallestNumber);
    }
}

