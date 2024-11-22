import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int doctors = 7;

        int treatedPatients = 0;
        int untreatedPatients = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && untreatedPatients > treatedPatients) doctors++;
            int patients = sc.nextInt();

            treatedPatients += Math.min(patients, doctors);
            if (patients - doctors > 0) untreatedPatients += patients - doctors;
        }

        System.out.printf("Treated patients: %d.\n", treatedPatients);
        System.out.printf("Untreated patients: %d.\n", untreatedPatients);
    }
}
