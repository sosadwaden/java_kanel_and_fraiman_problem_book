package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите программу (класс), которая принимает с клавиатуры двузначное
    число и проверяет, что больше: само это число или произведение его цифр.
 */
public class Task_6_10 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        int multiplicationOfNumbers = firstNumber * secondNumber;

        if (number > multiplicationOfNumbers) System.out.println("Число больше");
        if (number < multiplicationOfNumbers) System.out.println("Произведение больше");
    }
}
