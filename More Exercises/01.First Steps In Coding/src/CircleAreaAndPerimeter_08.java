import java.util.Scanner;

public class CircleAreaAndPerimeter_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());
        double area = Math.PI * Math.pow(r,2);
        double perimeter = 2*Math.PI*r;

        System.out.printf("%.2f\n", area);
        System.out.printf("%.2f", perimeter);
    }
}
