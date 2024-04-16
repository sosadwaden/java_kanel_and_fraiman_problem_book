package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран следующие значения (каждое в отдельной строке): снова
    введенное число и число, противоположное введенному числу.
 */
public class Task2_20 {

    public void example2_20() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number + "\n" + (-number));
    }
}
