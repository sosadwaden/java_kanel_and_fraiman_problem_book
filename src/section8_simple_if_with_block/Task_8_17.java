package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Трехзначное число называется «дважды четным», если и оно само, и
    сумма его цифр - четные.
    Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и проверяет, является ли оно «дважды четным».
    В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
    Обратите внимание: задание имеет решение с использованием единственного
    оператора if - без составного условия!
 */
public class Task_8_17 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;
        int summa = firstDigit + secondDigit + thirdDigit;
        boolean twiceEven = number % 2 == 0 && summa % 2 == 0;

        if (twiceEven) {
            System.out.println("Число дважды чётное");
        } else {
            System.out.println("Число не дважды чётное");
        }
    }
}
