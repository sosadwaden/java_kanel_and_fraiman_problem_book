package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    трехзначное число и выводит на экран его цифры, разделенные
    знаком «пробел», но в обратном порядке. То есть для числа 415 будет выведено на экран 5 1 4.
 */
public class Task_4_4 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        System.out.printf(thirdDigit + " " + secondDigit + " " + firstDigit);
        scanner.close();
    }
}
