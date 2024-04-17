package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «весом числа>> сумму· его цифр.
    Напишите класс, который принимает с клавиатуры число (трехзначное)
    и выводит на экран его «вес».
 */
public class Task_4_10 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;
        int numberWeight = firstDigit + secondDigit + thirdDigit;

        System.out.println(numberWeight);
    }
}
