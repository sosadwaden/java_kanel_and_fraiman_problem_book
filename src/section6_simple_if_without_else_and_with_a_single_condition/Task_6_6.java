package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран одно из следующих сообщений: Положительное, или
    Отрицательное, или Ноль, - в зависимости от значения числа.
 */
public class Task_6_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        if (number < 0) {
            System.out.println("Negative");
        }

        scanner.close();
    }
}
