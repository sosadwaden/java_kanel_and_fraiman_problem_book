package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Трехзначное число называется «опускающимся», если оно составлено
    из цифр, расположенных в порядке убывания (наибольшая - первая,
    наименьшая - последняя, все цифры разные; например, - 321).
    Напишите класс, который принимает с клавиатуры трехзначное число
    и проверяет, является ли оно «опускающимся». В соответствии с результатом
    проверки надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_9_13 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (firstDigit > secondDigit && secondDigit > thirdDigit) {
            System.out.println("Число опускающееся");
        } else {
            System.out.println("Нет");
        }

        scanner.close();
    }
}
