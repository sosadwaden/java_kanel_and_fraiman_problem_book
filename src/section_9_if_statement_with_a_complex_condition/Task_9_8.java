package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Назовем билет с шестизначным номером «счастливым», если сумма
    первых трех его цифр равна сумме последних трех его цифр и обе эти суммы являются четными.
    Напишите класс, который принимает с клавиатуры шестизначный номер
    билета и проверяет, является ли он «счастливым» или не является.
 */
public class Task_9_8 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstNumber = number / 100_000;
        int secondNumber = number / 10_000 % 10;
        int thirdNumber = number / 1000 % 10;
        int fourthNumber = number / 100 % 10;
        int fifthNumber = number / 10 % 10;
        int sixthNumber = number % 10;

        int sum123 = firstNumber + secondNumber + thirdNumber;
        int sum456 = fourthNumber + fifthNumber + sixthNumber;
        if ((sum123 == sum456) && (sum123 % 2 == 0) && (sum456 % 2 == 0)) {
            System.out.println("Счастливый");
        } else {
            System.out.println("Не счастливый");
        }
    }
}
