package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры положительное
    трехзначное число и проверяет, сколько разных цифр оно содержит.
 */
public class Task_9_29 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = 0;
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (firstDigit != secondDigit || firstDigit != thirdDigit) {
            count++;
        }
        if (secondDigit != thirdDigit) {
            count++;
        }

        System.out.println(count);
    }
}
