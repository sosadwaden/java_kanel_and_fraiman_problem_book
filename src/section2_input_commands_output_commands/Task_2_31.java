package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание:Кинетическая энергия тела подсчитывается как половина произведения
    массы тела на квадрат скорости тела.
    Напишите класс, который принимает с клавиатуры два числа, первое
    из которых - масса тела, а второе - его скорость.
    Класс должен подсчитать и вывести на экран значение кинетической энергии тела.
 */
public class Task_2_31 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double v = scanner.nextInt();
        double energy = (m * (v * v)) / 2;
        System.out.println("Кинетическая энергия: " + energy);
    }
}
