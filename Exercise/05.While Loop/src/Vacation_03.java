import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(sc.nextLine());
        double balance = Double.parseDouble(sc.nextLine());

        int spendCount = 0;
        int days = 0;

        boolean canSave = true;
        while (balance < moneyNeeded) {
            String action = sc.nextLine();
            double actionMoney = Double.parseDouble(sc.nextLine());

            if (action.equals("spend")) {
                spendCount++;
                balance -= actionMoney;
                if (balance < 0) balance = 0;
            } else {
                spendCount = 0;
                balance += actionMoney;
            }
            days++;

            if (spendCount == 5) {
                canSave = false;
                break;
            }
        }

        if (!canSave) System.out.printf("You can't save the money.\n%d", days);
        else System.out.printf("You saved the money for %d days.", days);
    }
}
