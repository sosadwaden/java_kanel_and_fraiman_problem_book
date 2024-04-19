package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры двузначное положительное
    число и проверяет, какая из его двух цифр является большей.
    В соответствии с результатом проверки надо вывести на экран
    соответствующее текстовое сообщение. Не следует выводить на экран
    никакого сообщения, если число составлено из одинаковых цифр.
 */
public class Task_8_15 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;

        if (firstDigit > secondDigit) {
            System.out.println("Число десятков больше числа единиц");
        }

        if (secondDigit > firstDigit) {
            System.out.println("Число единиц больше числа десятков");
        }
    }
}
