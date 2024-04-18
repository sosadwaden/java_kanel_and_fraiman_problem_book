package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два значения: первое -
    числитель дроби, второе - ее знаменатель (можно исходить из
    предположения, что второе значение отлично от нуля).
    Класс должен определить, является ли эта дробь положительной или
    отрицательной, и вывести на экран соответствующее текстовое сообщение.
 */
public class Task_6_14 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a / b > 0) System.out.println("Дробь положительная");
        if (a / b < 0) System.out.println("Дробь отрицательная");
    }
}
