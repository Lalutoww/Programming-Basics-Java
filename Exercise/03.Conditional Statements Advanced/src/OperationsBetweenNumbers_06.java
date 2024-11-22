import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        char operator = sc.next().charAt(0);
        int result;

        switch (operator) {
            case '+' -> {
                result = numberOne + numberTwo;
                String isEven = (result % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s", numberOne, operator, numberTwo, result, isEven);
            }
            case '-' -> {
                result = numberOne - numberTwo;
                String isEven = (result % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s", numberOne, operator, numberTwo, result, isEven);
            }
            case '*' -> {
                result = numberOne * numberTwo;
                String isEven = (result % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s", numberOne, operator, numberTwo, result, isEven);
            }
            case '%' -> {
                if (numberTwo == 0) System.out.printf("Cannot divide %d by zero", numberOne);
                else System.out.printf("%d %s %d = %d", numberOne, operator, numberTwo, numberOne % numberTwo);
            }
        };

        if (operator == '/' && numberTwo != 0)
            System.out.printf("%d %s %d = %.2f", numberOne, operator, numberTwo, (double) numberOne / numberTwo);
        else if (operator == '/' && numberTwo == 0) System.out.printf("Cannot divide %d by zero", numberOne);
    }
}
