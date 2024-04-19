package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Трехзначное число называется «поднимающимся», если оно составлено
    из цифр, расположенных в порядке возрастания (наименьшая -
    первая, наибольшая - последняя, все цифры разные; например - 123).
    Напишите класс, который принимает с клавиатуры трехзначное число
    и проверяет, является ли оно «поднимающимся». В соответствии с результатом
    проверки надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_9_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (firstDigit < secondDigit && secondDigit < thirdDigit) {
            System.out.println("Число поднимающееся");
        } else {
            System.out.println("Нет");
        }
    }
}
