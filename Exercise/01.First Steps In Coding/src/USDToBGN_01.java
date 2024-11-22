import java.util.Scanner;

public class USDToBGN_01 {
    public static void main(String[] args) {
        final double BGN_COURSE = 1.79549;

        Scanner scan = new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());
        double convertedCurrency = usd * BGN_COURSE;

        System.out.println(convertedCurrency);
    }
}
