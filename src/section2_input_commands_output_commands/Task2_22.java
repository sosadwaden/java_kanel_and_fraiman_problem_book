package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа и
    выводит на экран следующие значения (каждое в отдельной строке):
    сумму введенных чисел, их произведение, разницу между первым и
    вторым, разницу между вторым и первым.
 */
public class Task2_22 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("number1 + number2 = " + (number1 + number2));
        System.out.println("number1 * number2 = " + (number1 * number2));
        System.out.println("number1 - number2 = " + (number1 - number2));
        System.out.println("number2 - number1 = " + (number2 - number1));
    }
}
