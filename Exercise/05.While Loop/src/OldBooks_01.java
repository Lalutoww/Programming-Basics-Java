import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookToFind = sc.nextLine();
        String bookName = sc.nextLine();

        int bookCount = 0;
        boolean isBookFound = false;
        while (!bookName.equals("No More Books")) {
            if (bookToFind.equals(bookName)) {
                isBookFound = true;
                break;
            }

            bookCount++;
            bookName = sc.nextLine();
        }
        if (isBookFound) System.out.printf("You checked %d books and found it.", bookCount);
        else System.out.printf("The book you search is not here!\nYou checked %d books.", bookCount);
    }
}
