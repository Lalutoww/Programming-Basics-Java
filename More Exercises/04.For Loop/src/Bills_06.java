import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double WATER_BILL = 20.00;
        final double INTERNET_BILL = 15.00;


        int months = sc.nextInt();
        double totalElectricityBill = 0.00;
        double otherBills = 0.00;

        for (int i = 0; i < months; i++) {
            double electricityBill = sc.nextDouble();
            totalElectricityBill += electricityBill;

            otherBills += (electricityBill + WATER_BILL + INTERNET_BILL) * 1.20;
        }

        System.out.printf("Electricity: %.2f lv\n", totalElectricityBill);
        System.out.printf("Water: %.2f lv\n", WATER_BILL * months);
        System.out.printf("Internet: %.2f lv\n", INTERNET_BILL * months);
        System.out.printf("Other: %.2f lv\n", otherBills);
        System.out.printf("Average: %.2f lv", (totalElectricityBill + WATER_BILL * months + INTERNET_BILL * months + otherBills) / months);
    }
}
