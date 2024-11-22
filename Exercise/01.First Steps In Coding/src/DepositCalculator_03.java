import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double deposit = Double.parseDouble(scan.nextLine());
        int depositPeriod = Integer.parseInt(scan.nextLine());
        double annualInterestRate = Double.parseDouble(scan.nextLine());

        double finalSum = deposit + depositPeriod * ((deposit * (annualInterestRate / 100)) / 12);

        System.out.printf("%.2f", finalSum);

    }
}