package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «длиной двузначного числа» разницу между числом десятков
    (первая цифра) и числом единиц (вторая цифра).
    Напишите класс, который принимает с клавиатуры двузначное число и
    выводит на экран его «длину».
 */
public class Task_4_11 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int length = firstDigit - secondDigit;

        System.out.println(length);
    }
}
