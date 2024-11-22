import java.util.Scanner;

public class Numbers100To200_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 100 && number <= 200) System.out.println("Between 100 and 200");
        else if (number < 100) System.out.println("Less than 100");
        else System.out.println("Greater than 200");
    }
}
