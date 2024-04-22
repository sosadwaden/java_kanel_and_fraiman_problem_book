package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вводит с клавиатуры 15 целых положительных
    чисел, для каждого введенного числа класс напечатает сумму его цифр.
 */
public class Task_15_19 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 15; i++) {
            int number = scanner.nextInt();
            System.out.print("Число: " + number);
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            System.out.println(", Сумма его цифр: " + sum );
        }

        scanner.close();
    }
}
