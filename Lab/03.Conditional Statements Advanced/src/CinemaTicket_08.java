import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next();


        int price = switch (day){
            case "Monday", "Tuesday", "Friday" -> 12;
            case "Wednesday", "Thursday" -> 14;
            case "Saturday", "Sunday" -> 16;
            default -> 0;
        };
        System.out.println(price);
    }
}
