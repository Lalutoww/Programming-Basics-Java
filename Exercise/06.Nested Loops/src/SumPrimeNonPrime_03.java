import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);

            if (num < 0) System.out.println("Number is negative.");
            else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) primeSum += num;
                else nonPrimeSum += num;
            }
            input = sc.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
