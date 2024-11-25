import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lastSector = sc.nextLine().charAt(0);
        int rowsFirstSector = Integer.parseInt(sc.nextLine());
        int seatsOddRow = Integer.parseInt(sc.nextLine());
        int seatsEvenRow = seatsOddRow + 2;

        int totalSeats = 0;
        for (char sector = 'A'; sector <= lastSector; sector++) {
            for (int row = 1; row <= rowsFirstSector; row++) {
                if (row % 2 == 0) {
                    for (char seat = 'a'; seat < 'a' + seatsEvenRow; seat++) {
                        System.out.printf("%c%d%c%n", sector, row, seat);
                        totalSeats++;
                    }
                } else {
                    for (char seat = 'a'; seat < 'a' + seatsOddRow; seat++) {
                        System.out.printf("%c%d%c%n", sector, row, seat);
                        totalSeats++;
                    }
                }
            }
            rowsFirstSector++;
        }
        System.out.println(totalSeats);
    }
}
