package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «обменом» операцию, при которой два числа «обмениваются» своими правыми цифрами.
    Напишите класс, который принимает с клавиатуры два положительных числа и совершает
    над ними операцию «обмена». Числа могут быть разной длины.
 */
public class Task_4_25 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;

        number1 = (number1 / 10) * 10 + number2LastDigit;
        number2 = (number2 / 10) * 10 + number1LastDigit;

        System.out.println(number1);
        System.out.println(number2);

    }
}
