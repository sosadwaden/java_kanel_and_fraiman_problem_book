package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран два новых числа (каждое в отдельной строке): число,
    больше введенного с клавиатуры на 6, и число, меньше введенного с клавиатуры на 12.
 */
public class Task_2_16 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(number + 6);
        System.out.println(number - 12);
    }
}
