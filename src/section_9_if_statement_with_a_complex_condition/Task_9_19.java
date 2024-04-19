package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два положительных
    числа, которые должны быть длинами двух смежных сторон прямоугольника
    или квадрата. Класс должен определить, к какой из указанных
    двух фигур относятся введенные значения сторон.
 */
public class Task_9_19 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Квадрат");
        } else {
            System.out.println("Прямоугольник");
        }
    }
}
