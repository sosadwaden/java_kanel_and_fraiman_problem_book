package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое трехзначное
    положительное число и изменяет его следующим образом:
    • для чисел, больших 500, — переставляет местами числа единиц и сотен (вместо 672 - 276);
    • в остальных числах переставляются местами числа десятков и единиц (вместо 363 - 336).
    Программа должна вывести на экран новое значение переменной.
 */
public class Task_8_24 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;
        int newNumber;

        if (number > 500) {
            newNumber = thirdDigit * 100 + secondDigit * 10 + firstDigit;
        } else {
            newNumber = firstDigit * 100 + thirdDigit * 10 + secondDigit;
        }

        System.out.println(newNumber);
        scanner.close();
    }
}
