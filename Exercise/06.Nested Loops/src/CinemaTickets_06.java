import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(sc.nextLine());
            int tickets = 0;
            String ticket = sc.nextLine();
            while (!ticket.equals("End")) {
                tickets++;
                totalTickets++;
                if (ticket.equals("student")) studentTickets++;
                else if (ticket.equals("standard")) standardTickets++;
                else kidTickets++;
                if (tickets == freeSeats) break;
                ticket = sc.nextLine();
            }
            double percentFull = tickets * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentFull);
            movie = sc.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidTickets * 1.0 / totalTickets * 100);
    }
}
