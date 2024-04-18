package section7_simple_if_with_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры три числа: два первых
    должны быть длинами сторон катетов прямоугольного треугольника,
    а третье - длиной гипотенузы. Программа должна проверить,
    соответствуют ли введенные значения этому требованию.
    Внимание: допустимо предположить, что все вводимые числа - положительные.
 */
public class Task_7_9 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (c * c == a * a + b * b) {
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник не прямоугольный");
        }
    }
}
