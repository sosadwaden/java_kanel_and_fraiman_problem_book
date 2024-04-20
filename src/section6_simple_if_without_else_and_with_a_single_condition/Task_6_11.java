package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа и,
    если оба имеют одинаковый знак, на экран выводится сообщение
    Один и тот же знак, а если разный, то на экран выводится сообщение
    Разные знаки. Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
 */
public class Task_6_11 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean positive = a > 0 && b > 0;
        boolean different = (a < 0 && b > 0) || (a > 0 && b < 0);
        boolean zero = a == 0 || b == 0;

        if (positive) {
            System.out.println("Один и тот же знак");
        }
        if (different) {
            System.out.println("Разные знаки");
        }
        if (zero) {
            System.out.println("Некорректно");
        }

        scanner.close();
    }
}
