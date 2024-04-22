package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и выводит на экран количество его цифр и их сумму.
 */
public class Task_15_14 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
            count++;
        }

        System.out.println("Количество цифр: " + count);
        System.out.println("Сумма цифр: " + sum);
        scanner.close();
    }
}
