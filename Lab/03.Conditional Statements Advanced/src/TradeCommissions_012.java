import java.util.Scanner;

public class TradeCommissions_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.next();
        double sales = sc.nextDouble();
        double commission;

        switch (city) {
            case "Sofia" -> {
                if (sales >= 0 && sales <= 500) commission = sales * 0.05;
                else if (sales > 500 && sales <= 1000) commission = sales * 0.07;
                else if (sales > 1000 && sales <= 10000) commission = sales * 0.08;
                else if (sales > 10000) commission = sales * 0.12;
                else commission = 0.00;
            }
            case "Varna" -> {
                if (sales >= 0 && sales <= 500) commission = sales * 0.045;
                else if (sales > 500 && sales <= 1000) commission = sales * 0.075;
                else if (sales > 1000 && sales <= 10000) commission = sales * 0.10;
                else if (sales > 10000) commission = sales * 0.13;
                else commission = 0.00;
            }
            case "Plovdiv" -> {
                if (sales >= 0 && sales <= 500) commission = sales * 0.055;
                else if (sales > 500 && sales <= 1000) commission = sales * 0.08;
                else if (sales > 1000 && sales <= 10000) commission = sales * 0.12;
                else if (sales > 10000) commission = sales * 0.145;
                else commission = 0.00;
            }
            default -> commission = 0.00;
        }

        if (commission != 0.00) System.out.printf("%.2f", commission);
        else System.out.println("error");
    }
}
