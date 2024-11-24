import java.util.Scanner;

public class House_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if (number == 1) {
            System.out.print("*");
        } else if (number == 2) {
            System.out.print("**");
        } else {
            if (number % 2 == 0) {
                for (int i = 0; i < number / 2; i++) {
                    int numberOfDashes = i * 2;
                    int numberOfDashesOutside = number - 2 - numberOfDashes;
                    for (int j = 0; j < numberOfDashesOutside / 2; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                    for (int j = 0; j < numberOfDashes; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                    for (int j = 0; j < numberOfDashesOutside / 2; j++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
                for (int i = (number - 1) / 2 - 1; i >= 0; i--) {
                    int numberOfDashes = i * 2;
                    int numberOfDashesOutside = number - 2 - numberOfDashes;
                    for (int j = 0; j < numberOfDashesOutside / 2; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                    for (int j = 0; j < numberOfDashes; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                    for (int j = 0; j < numberOfDashesOutside / 2; j++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
            } else {
                for (int j = 0; j < (number - 1) / 2; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 0; j < (number - 1) / 2; j++) {
                    System.out.print("-");
                }
                System.out.println();

                int rows = (number - 1) / 2;

                for (int curentRow = 0; curentRow < rows; curentRow++) {
                    int numberOfDashes = (curentRow * 2) + 1;
                    int numberOfDashesOutside = number - 2 - numberOfDashes;
                    for (int j = 0; j < numberOfDashesOutside / 2; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                    for (int j = 0; j < numberOfDashes; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                    for (int j = 0; j < numberOfDashesOutside / 2; j++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }

                for (int curentRow = rows - 2; curentRow >= 0; curentRow--) {
                    int numberOfDashes = (curentRow * 2) + 1;
                    int numberOfDashesOutside = number - 2 - numberOfDashes;
                    for (int j = 0; j < numberOfDashesOutside / 2; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                    for (int j = 0; j < numberOfDashes; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                    for (int j = 0; j < numberOfDashesOutside / 2; j++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }

                for (int j = 0; j < (number - 1) / 2; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 0; j < (number - 1) / 2; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}