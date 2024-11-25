import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char start = sc.nextLine().charAt(0);
        char end = sc.nextLine().charAt(0);
        char skip = sc.nextLine().charAt(0);
        int counter = 0;

        for (char i = start; i <= end; i++) {
            for (char j = start; j <= end; j++) {
                for (char k = start; k <= end; k++) {
                    if (i != skip && j != skip && k != skip) {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
