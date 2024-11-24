import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apartmentWidth = Integer.parseInt(sc.nextLine());
        int apartmentLength = Integer.parseInt(sc.nextLine());
        int apartmentHeight = Integer.parseInt(sc.nextLine());

        int totalSpace = apartmentWidth * apartmentLength * apartmentHeight;
        boolean isThereFreeSpace = true;
        int spaceLeft = 0;

        String input = sc.nextLine();
        while (!input.equals("Done")) {
            int box = Integer.parseInt(input);
            if (box > totalSpace) {
                isThereFreeSpace = false;
                spaceLeft = box - totalSpace;
                break;
            }

            totalSpace -= box;
            spaceLeft = totalSpace;
            input = sc.nextLine();
        }
        if (!isThereFreeSpace) System.out.printf("No more free space! You need %d Cubic meters more.", spaceLeft);
        else System.out.printf("%d Cubic meters left.", spaceLeft);


    }
}
