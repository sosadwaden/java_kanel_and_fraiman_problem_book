package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Целое трехзначное число называется «дважды четным», если и сумма
    его цифр, и их произведение являются четными.
    Напишите класс, который принимает с клавиатуры положительное
    трехзначное число и проверяет, является ли оно «дважды четным».
 */
public class Task_9_23 {

    public void action(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (((firstDigit + secondDigit + thirdDigit) % 2 == 0) &&
           ((firstDigit * secondDigit * thirdDigit) % 2 == 0)) {
            System.out.println("Дважды чётное");
        } else {
            System.out.println("Не дважды чётное");
        }

        scanner.close();
    }
}
