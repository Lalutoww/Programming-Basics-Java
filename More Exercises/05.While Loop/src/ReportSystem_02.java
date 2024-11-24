import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(sc.nextLine());
        int cashCount = 0, cardCount = 0, count = 1;
        double totalCash = 0, totalCard = 0;
        boolean hasMoney = false;

        String input = sc.nextLine();
        while (!input.equals("End")) {
            double price = Double.parseDouble(input);

            if (count % 2 == 0) {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                    count++;
                    input = sc.nextLine();
                    continue;
                }
                totalCard += price;
                cardCount++;
            } else {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                    count++;
                    input = sc.nextLine();
                    continue;
                }
                totalCash += price;
                cashCount++;
            }

            count++;
            System.out.println("Product sold!");
            moneyNeeded -= price;

            if (moneyNeeded <= 0) {
                hasMoney = true;
                break;
            }

            input = sc.nextLine();
        }

        if (!hasMoney) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f\nAverage CC: %.2f\n",
                    totalCash / cashCount, totalCard / cardCount);
        }
    }
}
