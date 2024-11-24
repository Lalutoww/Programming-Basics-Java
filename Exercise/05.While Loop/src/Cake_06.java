import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(sc.nextLine());
        int cakeLength = Integer.parseInt(sc.nextLine());

        int cake = cakeWidth * cakeLength;
        String input = sc.nextLine();
        int piecesLeft = 0;
        boolean isCakeEnough = true;
        while (!input.equals("STOP")) {
            int piece = Integer.parseInt(input);
            if (cake - piece < 0) {
                isCakeEnough = false;
                piecesLeft = Math.abs(cake - piece);
                break;
            }

            cake -= piece;
            piecesLeft = cake;
            input = sc.nextLine();
        }
        if (isCakeEnough) System.out.printf("%d pieces are left.", piecesLeft);
        else System.out.printf("No more cake left! You need %d pieces more.", piecesLeft);
    }
}
