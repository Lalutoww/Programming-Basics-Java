import java.util.Scanner;

public class BonusPoints_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double bonusPoints = 0;

        // Main bonus calculations
        if(number <= 100) bonusPoints = 5;
        else if(number > 100 && number <= 1000) bonusPoints = number * 0.2;
        else if(number > 1000) bonusPoints = number * 0.1;

        // Additional bonus calculations
        if(number % 2 == 0) bonusPoints++;
        if(number % 10 == 5) bonusPoints+=2;

        System.out.println(bonusPoints);
        System.out.println(number + bonusPoints);
    }
}
