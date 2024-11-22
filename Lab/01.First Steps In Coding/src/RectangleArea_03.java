import java.util.Scanner;

public class RectangleArea_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;
        System.out.println("The area of the rectangle is: " + area);
    }
}
