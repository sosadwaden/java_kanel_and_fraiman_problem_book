package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    двузначное число. Затем следует построить новое значение, составленное
    из цифр числа, введенного с клавиатуры, но в обратном
    порядке. После этого новое значение следует увеличить на 8, и окончательный
    результат вывести на экран. То есть для числа 37 следует построить
    число 73 и вывести на экран 81.
 */
public class Task_4_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int newNumber = secondDigit * 10 + firstDigit + 8;

        System.out.println(newNumber);
    }
}
