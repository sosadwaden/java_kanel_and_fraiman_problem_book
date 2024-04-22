package section_16_nested_loops;

import java.util.Scanner;

/*
    Задание: Два положительных трехзначных числа а и b называются «родственными»,
    если сумма делителей числа а равна b, а сумма делителей числа
    b равна а. Например, это числа 220 и 284, так как сумма делителей 220
    равна 284, а сумма делителей 284 равна 220.
    Напишите класс, который принимает с клавиатуры положительное
    трехзначное число и ищет ближайшее к нему и большее него «родственное» число.
 */
public class Task_16_13 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int relativeNumber = number + 1;

        while (true) {
            int sumA = 0;
            int sumB = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumA += i;
                }
            }

            for (int i = 1; i <= relativeNumber / 2; i++) {
                if (relativeNumber % i == 0) {
                    sumB += i;
                }
            }

            if (sumA == relativeNumber && sumB == number) {
                System.out.println("Ближайшее к " + number + " родственное число: " + relativeNumber);
                break;
            }
            relativeNumber++;
        }
        scanner.close();
    }
}
