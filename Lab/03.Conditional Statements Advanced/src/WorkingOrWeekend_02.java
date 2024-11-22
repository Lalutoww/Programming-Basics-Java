import java.util.Scanner;

public class WorkingOrWeekend_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String dayType;

        switch(input){
            case "Monday": dayType = "Working day"; break;
            case "Tuesday": dayType = "Working day"; break;
            case "Wednesday": dayType = "Working day"; break;
            case "Thursday": dayType = "Working day"; break;
            case "Friday": dayType = "Working day"; break;
            case "Saturday": dayType = "Weekend"; break;
            case "Sunday": dayType = "Weekend"; break;
            default: dayType = "Error"; break;
        }

        System.out.println(dayType);
    }
}
