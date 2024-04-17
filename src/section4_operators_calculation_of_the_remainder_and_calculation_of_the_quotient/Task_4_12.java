package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «длиной трехзначного числа» разницу между его первой (число
    сотен) и последней (число единиц) цифрами, умноженную на его
    среднюю (число десятков) цифру.
    Напишите класс, который принимает с клавиатуры целое положительное
    трехзначное число, вычисляет его «длину» и выводит результат на экран.
 */
public class Task_4_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;
        int length = (firstDigit - thirdDigit) * secondDigit;

        System.out.println(length);
    }
}
