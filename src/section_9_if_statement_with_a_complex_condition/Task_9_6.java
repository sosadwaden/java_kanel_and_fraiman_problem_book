package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры три положительных
    числа и проверяет, могут ли они являться длинами сторон треугольника.
    По результатам проверки следует вывести на экран соответствующее текстовое сообщение.
 */
public class Task_9_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Стороны");
        } else {
            System.out.println("Нет");
        }

        scanner.close();
    }
}
