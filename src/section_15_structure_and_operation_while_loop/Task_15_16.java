package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран количество четных цифр в нем и сумму его нечетных цифр.
 */
public class Task_15_16 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                count++;
            } else {
                sum += lastDigit;
            }

            number /= 10;
        }

        System.out.println("Количество четных цифр: " + count);
        System.out.println("Сумма нечетных цифр: " + sum);
        scanner.close();
    }
}
