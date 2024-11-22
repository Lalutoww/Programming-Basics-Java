import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysToComplete = Integer.parseInt(scan.nextLine());

        int hoursPerDay = (pages / pagesPerHour) / daysToComplete;

        System.out.println(hoursPerDay);
    }
}
