import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.next();
        int nights = sc.nextInt();
        double studioPrice = 0, apartmentPrice = 0;

        switch (month) {
            case "May", "October" -> {
                studioPrice = 50;
                apartmentPrice = 65;
                if (nights > 7 && nights <= 14) studioPrice *= 0.95;
                else if (nights > 14) studioPrice *= 0.70;
            }
            case "June", "September" -> {
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14) studioPrice *= 0.80;
            }
            case "July", "August" -> {
                studioPrice = 76;
                apartmentPrice = 77;
            }
        }
        if (nights > 14) apartmentPrice *= 0.90;

        apartmentPrice *= nights;
        studioPrice *= nights;
        System.out.printf("Apartment: %.2f lv. \n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
