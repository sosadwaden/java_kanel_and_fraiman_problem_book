package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран следующие значения (каждое в отдельной строке): три
    целых числа, следующих за значением, введенным с клавиатуры.
 */
public class Task_2_21 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int a = number + 1;
        int b = number + 2;
        int c = number + 3;

        System.out.printf("%d%n%d%n%d%n", a, b, c);
        scanner.close();
    }
}
