package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите программу, которая выполняет перестановку над четырехзначным числом.
 */
public class Task_4_17 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 1000;
        int secondDigit = number / 100 % 10;
        int thirdDigit = number / 10 % 10;
        int fourthDigit = number % 10;
        int numberOut = fourthDigit * 1000 + secondDigit * 100 + thirdDigit * 10 + firstDigit;

        System.out.println(numberOut);
    }
}
