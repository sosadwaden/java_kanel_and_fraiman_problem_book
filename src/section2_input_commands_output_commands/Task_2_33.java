package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры три числа:
    значения оснований трапеции и ее высоту.
    Класс должен подсчитать и вывести на экран площадь этой трапеции.
 */
public class Task_2_33 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), h = scanner.nextDouble(), S;
        S = (0.5 * h * (a + b));

        System.out.println("Площадь трапеции: " + S);
        scanner.close();
    }
}
