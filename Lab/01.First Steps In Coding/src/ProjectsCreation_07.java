import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projectsNumber = Integer.parseInt(scan.nextLine());

        int hoursNeeded = projectsNumber * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hoursNeeded, projectsNumber);
    }
}
