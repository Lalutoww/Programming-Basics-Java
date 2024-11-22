import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int volume = sc.nextInt();
        int pOne = sc.nextInt();
        int pTwo = sc.nextInt();
        double restHours = sc.nextDouble();

        double firstPipeLiters = pOne * restHours;
        double secondPipeLiters = pTwo * restHours;

        double totalLiters = firstPipeLiters + secondPipeLiters;

        if (totalLiters <= volume) {
            double totalPercent = (totalLiters / volume) * 100;
            double pipeOnePercent = (firstPipeLiters / totalLiters) * 100;
            double pipeTwoPercent = (secondPipeLiters / totalLiters) * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPercent, pipeOnePercent, pipeTwoPercent);
        } else {
            double overflow = totalLiters - volume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", restHours, overflow);
        }
    }
}
