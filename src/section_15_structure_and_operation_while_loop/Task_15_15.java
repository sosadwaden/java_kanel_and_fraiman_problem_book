package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран количество четных цифр в нем и их сумму.
 */
public class Task_15_15 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                sum += lastDigit;
                count++;
            }

            number /= 10;
        }

        System.out.println("Количество четных цифр: " + count);
        System.out.println("Сумма четных цифр: " + sum);
        scanner.close();
    }
}
