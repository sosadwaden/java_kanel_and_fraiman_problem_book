package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры двузначное положительное
    число и проверяет, является ли в нем первая цифра (десятков)
    больше второй (единиц). В соответствии с результатом проверки
    надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_8_14 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;

        if (firstDigit > secondDigit) {
            System.out.println("Число десятков больше числа единиц");
        }

        if (firstDigit == secondDigit) {
            System.out.println("Число десятков равно числу единиц");
        }

        if (firstDigit < secondDigit) {
            System.out.println("Число десятков меньше числа единиц");
        }

        scanner.close();
    }
}
