import java.util.Scanner;

public class InvalidNumber_010 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int number = sc.nextInt();

       if(!(number >= 100 && number <= 200) && number != 0) System.out.println("invalid");
    }
}
