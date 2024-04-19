package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Целое трехзначное число называется «горой», если его средняя цифра больше крайних.
    Напишите класс, который принимает с клавиатуры положительное
    трехзначное число и проверяет, является ли оно «горой».
 */
public class Task_9_24 {

    public void action(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (secondDigit > firstDigit && secondDigit > thirdDigit) {
            System.out.println("Гора");
        } else {
            System.out.println("Не гора");
        }
    }
}
