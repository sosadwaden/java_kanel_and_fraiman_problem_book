package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вводит с клавиатуры 15 целых положительных
    чисел, для каждого введенного числа класс должен напечатать сумму его цифр.
    После окончания ввода класс выведет на экран порядковый номер
    числа с самой большой суммой цифр.
 */
public class Task_15_22 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int position = 1;
        int max = firstNumber;

        for (int i = 2; i <= 15; i++) {
            int number = scanner.nextInt();
            System.out.print("Число: " + number);
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum > max) {
                position = i;
                max = sum;
            }

            System.out.println(", Сумма его цифр: " + sum );
        }

        System.out.print("Максимальная сумма цифр: " + max + ", позиция: " + position);
        scanner.close();
    }
}
