package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран число, которое больше введенного с клавиатуры на 10.
 */
public class Task2_14 {

    public void example2_14() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(number + 10);
    }
}
