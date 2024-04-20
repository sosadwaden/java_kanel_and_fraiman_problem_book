package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры положительное
    целое число и выводит на экран ближайшее к нему «круглое число».
    Например, для введенного значения 433 выводится на экран 430, а для 56 выводится 60.
 */
public class Task_8_21 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        int newNumber;

        if (lastDigit < 5) {
            newNumber = (number / 10) * 10;
        } else {
            newNumber = (number / 10 + 1) * 10;
        }

        System.out.println(newNumber);
        scanner.close();
    }
}
