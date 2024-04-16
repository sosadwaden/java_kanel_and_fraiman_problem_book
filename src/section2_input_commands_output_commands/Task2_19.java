package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран следующие три значения (все - в одной строке, разделенные
    пробелом): число, меньше введенного с клавиатуры на 1,
    число, введенное с клавиатуры, и число, больше введенного с клавиатуры на 1.
 */
public class Task2_19 {

    public void example2_19() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int b = number - 1;
        int c = number + 1;

        System.out.printf("%d %d %d", b, number, c);
    }
}
