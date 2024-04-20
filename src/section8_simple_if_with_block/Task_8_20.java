package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и проверяет, содержится ли в нем хотя бы один ноль.
    По результатам проверки надо вывести на экран соответствующее текстовое сообщение.
 */
public class Task_8_20 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean firstDigitZero = number / 100 == 0;
        boolean secondDigitZero = number / 10 % 10 == 0;
        boolean thirdDigitZero = number % 10 == 0;
        boolean oneZero = firstDigitZero || secondDigitZero || thirdDigitZero;

        if (oneZero) {
            System.out.println("Число содержит ноль");
        } else {
            System.out.println("Число не содержит ноль");
        }

        scanner.close();
    }
}
