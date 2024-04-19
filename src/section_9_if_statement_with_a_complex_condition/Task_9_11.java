package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Трехзначное число называется «плоским», если оно составлено из одинаковых
    цифр. Напишите класс, который принимает с клавиатуры
    трехзначное число и проверяет, является ли оно «плоским». В соответствии
    с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_9_11 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if ((firstDigit == secondDigit) &&
            (secondDigit == thirdDigit)) {
            System.out.println("Число плоское");
        } else {
            System.out.println("Число не плоское");
        }
    }
}
