package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры двузначное положительное
    число и проверяет, составлено ли оно из одинаковых цифр.
    В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_8_13 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;

        if (firstDigit == secondDigit) {
            System.out.println("Цифры числа равны");
        } else {
            System.out.println("Цифры числа не равны");
        }

        scanner.close();
    }
}
