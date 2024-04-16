package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран новое число, которое больше введенного с клавиатуры в 10 раз.
 */
public class Task2_15 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(number * 10);
    }
}
