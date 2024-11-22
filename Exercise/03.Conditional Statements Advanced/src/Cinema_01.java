import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String projection = sc.next();
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int theaterArea = rows * columns;

        double income = switch (projection){
            case "Premiere" -> theaterArea * 12.00;
            case "Normal" -> theaterArea * 7.50;
            case "Discount" -> theaterArea * 5.00;
            default -> 0.00;
        };

        System.out.printf("%.2f leva", income);
    }
}
