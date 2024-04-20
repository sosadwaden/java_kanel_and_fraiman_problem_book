package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «перестановкой» операцию над числом, при которой его первая
    и последняя цифры меняются местами. Например, из числа 1234
    получается число 4231. Напишите программу, которая принимает с
    клавиатуры трехзначное число и строит из него новое число методом «перестановки».
 */
public class Task_4_16 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;
        int numberOut = thirdDigit * 100 + secondDigit * 10 + firstDigit;

        System.out.println(numberOut);
        scanner.close();
    }
}
