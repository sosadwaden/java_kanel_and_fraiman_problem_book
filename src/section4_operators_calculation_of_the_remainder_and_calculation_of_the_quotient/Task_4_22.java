package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «сдвигом числа вправо по кругу» операцию, при которой все
    цифры числа сдвигаются вправо, а число единиц (последняя цифра)
    перемещается в старший разряд числа (первая цифра).
    Например, из числа 1234 получается число 4123.
    Напишите класс, который принимает с клавиатуры трехзначное число
    и строит новое число, полученное «сдвигом вправо по кругу».
 */
public class Task_4_22 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftPart = number / 10;
        int rightPart = number % 10;
        int newNumber = rightPart * 100 + leftPart;

        System.out.println(newNumber);
        scanner.close();
    }
}
