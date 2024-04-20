package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите класс, который выполняет «линейный сдвиг влево» для четырехзначного числа.
 */
public class Task_4_19 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int secondDigit = number / 100 % 10;
        int thirdDigit = number / 10 % 10;
        int fourthDigit = number % 10;
        int newNumber = secondDigit * 1000 + thirdDigit * 100 + fourthDigit * 10;

        System.out.println(newNumber);
        scanner.close();
    }
}
