package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Для вычисления числа π используется формула Махадевы-Эйлера:
    π = 4/1 - 4/3 + 4/5 - 4/7+...
    Напишите класс, который принимает с клавиатуры число слагаемых в
    ряду Махадевы-Эйлера и вычисляет значение числа π.
 */
public class Task_13_33 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слагаемых в ряду Махадевы-Эйлера: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (2 * i + 1);
        }

        double pi = sum * 4;
        System.out.println("Значение числа π: " + pi);
        scanner.close();
    }
}
