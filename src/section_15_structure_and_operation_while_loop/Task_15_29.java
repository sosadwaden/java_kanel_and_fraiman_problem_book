package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и подсчитывает сумму его цифр.
    Результат подсчета должен быть выведен на экран. Например, для числа
    534 на экран будет выведено 12.
 */
public class Task_15_29 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);
        scanner.close();
    }
}
