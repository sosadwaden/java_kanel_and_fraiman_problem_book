package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите класс, который выполняет «сдвиг влево по кругу» для четырехзначного числа.
 */
public class Task_4_21 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftPart = number / 1000;
        int rightPart = number % 1000;
        int newNumber = rightPart * 10 + leftPart;

        System.out.println(newNumber);
    }
}
