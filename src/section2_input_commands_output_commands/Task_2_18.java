package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и затем
    выводит на экран его квадрат и его же куб, а между ними знак &.
 */
public class Task_2_18 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.printf("%d & %d", number * number, number * number * number);
    }
}
