package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран следующие значения (каждое в отдельной строке): снова
    введенное число и число, противоположное введенному числу.
 */
public class Task_2_20 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number + "\n" + (-number));
        scanner.close();
    }
}
