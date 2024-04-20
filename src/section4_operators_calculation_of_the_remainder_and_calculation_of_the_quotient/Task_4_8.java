package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    трехзначное число. Затем следует построить новое значение, составленное
    из цифр числа, введенного с клавиатуры, но в обратном
    порядке. После этого новое значение следует уменьшить на 20, и окончательный
    результат вывести на экран. То есть для числа 327 следует
    построить число 723 и вывести на экран 703.
 */
public class Task_4_8 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;
        int newNumber = (thirdDigit * 100 + secondDigit * 10 + firstDigit) - 20;

        System.out.println(newNumber);
        scanner.close();
    }
}
