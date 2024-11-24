import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = "", result = "";
        int cCount = 0, oCount = 0, nCount = 0;


        String input = sc.nextLine();

        while (!input.equals("End")) {

            if (input.matches("[a-zA-Z]+")) {

                text += input;

                if (input.equals("c") && cCount != 1) {
                    text = text.substring(0, text.length() - 1);
                    cCount++;
                } else if (input.equals("o") && oCount != 1) {
                    text = text.substring(0, text.length() - 1);
                    oCount++;
                } else if (input.equals("n") && nCount != 1) {
                    text = text.substring(0, text.length() - 1);
                    nCount++;
                }

                if (cCount == 1 && oCount == 1 && nCount == 1) {
                    text = text + " ";
                    result = text;
                    cCount = 0;
                    oCount = 0;
                    nCount = 0;
                }

            }
            input = sc.nextLine();
        }
        System.out.println(result);
    }
}
