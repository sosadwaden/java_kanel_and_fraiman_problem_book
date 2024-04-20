package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «весом числа» сумму его цифр.
    Напишите класс, который принимает с клавиатуры число (двузначное)
    и выводит на экран его «вес».
 */
public class Task_4_9 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int numberWeight = firstDigit + secondDigit;

        System.out.println(numberWeight);
        scanner.close();
    }
}
