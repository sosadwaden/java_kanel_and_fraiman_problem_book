package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который сначала заносит в переменную строковое значение Привет,
    а затем принимает с клавиатуры ваше имя.
    Класс должен вывести на экран в одной строке сообщение, составленное
    из строкового значения Привет, знака «запятая» и вашего имени.
 */
public class Task_2_34 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String hello = "Привет";
        String name = scanner.nextLine();

        System.out.printf("%s, %s", hello, name);
        scanner.close();
    }
}
