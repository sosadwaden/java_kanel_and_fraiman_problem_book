package section7_simple_if_with_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите программу, которая принимает с клавиатуры число и превращает
    его в положительное, если оно отрицательное либо в ноль во всех остальных случаях.
 */
public class Task_7_10 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0) {
            number *= -1;
        } else {
            number = 0;
        }

        System.out.println(number);
        scanner.close();
    }
}
