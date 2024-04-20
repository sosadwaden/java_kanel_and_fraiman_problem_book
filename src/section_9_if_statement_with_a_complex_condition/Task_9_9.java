package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры коэффициенты а и
    b линейного уравнения (уравнения первой степени - ах+Ь=О) и решает
    его, — то есть выводит на экран или корень (корни) уравнения, или соответствующее
    смыслу текстовое сообщение.
 */
public class Task_9_9 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество решений");
        }
        if (a == 0 && b != 0) {
            System.out.println("Нет решения");
        }
        if (a != 0) {
            System.out.println(-b / a);
        }

        scanner.close();
    }
}
