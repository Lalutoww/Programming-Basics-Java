import java.util.Scanner;

public class WeatherForecast2_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double degrees = Double.parseDouble(scan.nextLine());
        String textMessage;


        if (degrees >= 26.0 && degrees <= 35.00) textMessage = "Hot";
        else if (degrees >= 20.1 && degrees <= 25.9) textMessage = "Warm";
        else if (degrees >= 15.0 && degrees <= 20.0) textMessage = "Mild";
        else if (degrees >= 12.0 && degrees <= 14.9) textMessage = "Cool";
        else if (degrees >= 5.0 && degrees <= 11.9) textMessage = "Cold";
        else textMessage = "unknown";

        System.out.println(textMessage);
    }
}

