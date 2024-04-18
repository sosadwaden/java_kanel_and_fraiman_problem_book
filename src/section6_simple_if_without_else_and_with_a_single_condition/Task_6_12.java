package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задача: Напишите класс, который принимает с клавиатуры три значения (а, b и с),
    являющиеся коэффициентами квадратного уравнения.
    Класс должен определить, имеется ли у этого уравнения хотя бы один
    корень (решение), и вывести на экран соответствующее текстовое сообщение.
 */
public class Task_6_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;

        if (d >= 0) System.out.println("Да");
        if (d < 0) System.out.println("Нет");
    }
}
