package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число,
    представляющее собой промежуток времени в часах, и выводит на
    экран тот же промежуток времени, но выраженный в секундах.
 */
public class Task2_29 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int seconds = hours * 60 * 60;

        System.out.println(seconds);
    }
}
