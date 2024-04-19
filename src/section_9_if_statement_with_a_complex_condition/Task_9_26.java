package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Назовем двузначное число «внутренним» по отношению к четырехзначному
    числу, если какая-то пара смежных цифр в четырехзначном
    числе образует двузначное число.
    Напишите класс, который принимает с клавиатуры два положительных
    числа - двузначное и четырехзначное - и проверяет, является ли двузначное
    «внутренним» по отношению к четырехзначному.
 */
public class Task_9_26 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int doubleDigitsNumber = scanner.nextInt();
        int fourDigitsNumber = scanner.nextInt();

        int firstCouple = fourDigitsNumber / 100;
        int secondCouple = fourDigitsNumber / 10 % 100;
        int thirdCouple = fourDigitsNumber % 100;

        if (doubleDigitsNumber == firstCouple ||
            doubleDigitsNumber == secondCouple ||
            doubleDigitsNumber == thirdCouple) {
            System.out.println("Внутреннее двухзначное число");
        } else {
            System.out.println("Нет");
        }
    }
}
