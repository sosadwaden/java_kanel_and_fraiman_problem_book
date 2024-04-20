package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры три числа и проверяет,
    являются ли эти числа углами одного и того же треугольника.
    По результатам проверки следует вывести на экран соответствующее текстовое сообщение.
 */
public class Task_9_17 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b + c == 180) && (a > 0 && b > 0 && c > 0)) {
            System.out.println("Это углы одного треугольника");
        } else {
            System.out.println("Эти углы из разных треугольников");
        }

        scanner.close();
    }
}
