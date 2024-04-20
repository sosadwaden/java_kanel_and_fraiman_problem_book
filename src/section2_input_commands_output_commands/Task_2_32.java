package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры число
    и выводит на экран обратное ему значение.
 */
public class Task_2_32 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Обратное число: " + (1.0 / number));
        scanner.close();
    }
}
