import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figureType = sc.nextLine();
        double area;

        switch (figureType) {
            case "square" -> {
                double a = sc.nextDouble();
                area = Math.pow(a, 2);
            }
            case "rectangle" -> {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                area = a * b;
            }
            case "circle" -> {
                double r = sc.nextDouble();
                area = Math.PI * Math.pow(r, 2);
            }
            default -> {
                double a = sc.nextDouble();
                double h = sc.nextDouble();
                area = (a * h) / 2;
            }
        }
        System.out.printf("%.3f", area);
    }
}
