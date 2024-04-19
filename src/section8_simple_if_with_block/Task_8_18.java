package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Назовем «степенью четности» числа количество четных цифр в его составе
    (например, степень четности для 2346 равна 3).
    Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и определяет, какова его «степень четностью». В соответствии
    с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_8_18 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (firstDigit % 2 == 0) {
            count++;
        }
        if (secondDigit % 2 == 0) {
            count++;
        }
        if (thirdDigit % 2 == 0) {
            count++;
        }

        System.out.println("Степень чётности числа: " + count);
    }
}
