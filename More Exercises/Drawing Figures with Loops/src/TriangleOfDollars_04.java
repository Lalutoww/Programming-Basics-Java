import java.util.Scanner;

public class TriangleOfDollars_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            if(i>0) System.out.println();
            for (int j = 0; j < i+1; j++) {
                System.out.print("$ ");
            }
        }
    }
}