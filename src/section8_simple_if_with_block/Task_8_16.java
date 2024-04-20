package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы.
    Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и проверяет, является ли оно «симметричным». В соответствии
    с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_8_16 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int thirdDigit = number % 10;

        if (firstDigit == thirdDigit) {
            System.out.println("Число симметричное");
        } else  {
            System.out.println("Число не симметричное");
        }

        scanner.close();
    }
}
