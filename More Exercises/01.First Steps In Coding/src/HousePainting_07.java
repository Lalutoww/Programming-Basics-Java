import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        final double WINODW_AREA = 2.25;
        final double ENTRANCE_AREA = 2.4;
        final double GREEN_PAINT = 3.4;
        final double RED_PAINT = 4.3;

        double sideWall = x * y;
        double frontAndBackWalls = Math.pow(x,2);
        double totalAreaBase = (2*sideWall - 2*WINODW_AREA) + (2*frontAndBackWalls-ENTRANCE_AREA);
        double neededGreenPaint = totalAreaBase / GREEN_PAINT;

        double roofRectangles = 2 * x * y;
        double roofTriangles = 2 * (x * h / 2);
        double totalAreaRoof = roofRectangles + roofTriangles;
        double neededRedPaint = totalAreaRoof / RED_PAINT;

        System.out.printf("%.2f \n", neededGreenPaint);
        System.out.printf("%.2f", neededRedPaint);

    }
}
