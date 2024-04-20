package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите класс, который выполняет «сдвиг вправо по кругу» для четырехзначного числа.
 */
public class Task_4_23 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftPart = number / 10;
        int rightPart = number % 10;
        int newNumber = rightPart * 1000 + leftPart;

        System.out.println(newNumber);
        scanner.close();
    }
}
