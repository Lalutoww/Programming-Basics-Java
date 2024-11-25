import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {
        //Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа. На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число. Ако няма нито една комбинация отговаряща на условието се печата съобщение, че не е намерено.
        //Вход
        //Входът се чете от конзолата и се състои от три реда:
        //•	Първи ред – начало на интервала – цяло число в интервала [1...999]
        //•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        //•	Трети ред – магическото число – цяло число в интервала [1...10000]
        //Изход
        //На конзолата трябва да се отпечата един ред, според резултата:
        //•	Ако е намерена комбинация чиито сбор на числата е равен на магическото число
        //o	"Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
        //•	Ако не е намерена комбинация отговаряща на условието
        //o	"{броят на всички комбинации} combinations - neither equals {магическото число}"

        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());
        int counter = 0;
        boolean isFound = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, magicNumber);
                    isFound = true;
                    break;
                }
            }
            if (isFound) break;
        }
        if (!isFound) System.out.printf("%d combinations - neither equals %d%n", counter, magicNumber);
    }
}
