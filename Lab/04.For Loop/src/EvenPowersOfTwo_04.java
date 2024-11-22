import java.util.Scanner;

public class EvenPowersOfTwo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<=n; i++){
            double power = Math.pow(2, i);
            if(i % 2 == 0) System.out.printf("%.0f \n", power);
        }
    }
}
