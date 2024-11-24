import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        double totalBalance = 0;
        while (!input.equals("NoMoreMoney")) {
            double balance = Double.parseDouble(input);

            if (balance < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            totalBalance += balance;
            System.out.printf("Increase: %.2f\n", balance);

            input = sc.nextLine();
        }

        System.out.printf("Total: %.2f", totalBalance);
    }
}
