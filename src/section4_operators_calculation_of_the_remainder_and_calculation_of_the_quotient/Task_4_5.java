package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    двузначное число и выводит его на экран в «полном виде»: например,
    для числа 34 это будет выглядеть как 30+4.
 */
public class Task_4_5 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = (number / 10) * 10;
        int secondDigit = number % 10;

        System.out.println(firstDigit + "+" +  secondDigit);
    }
}
