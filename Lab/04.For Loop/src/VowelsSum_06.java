import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            sum += switch (character) {
                case 'a' -> 1;
                case 'e' -> 2;
                case 'i' -> 3;
                case 'o' -> 4;
                case 'u' -> 5;
                default -> 0;
            };
        }
        System.out.println(sum);
    }
}
