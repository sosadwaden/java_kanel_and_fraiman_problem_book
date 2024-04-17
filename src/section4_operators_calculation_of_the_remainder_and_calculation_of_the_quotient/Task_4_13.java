package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Назовем «степенью четности» числа количество четных цифр в нем. Например,
    для числа 4612 степень четности равна 3 (в его составе три четных цифры - 4, 6 и 2).
    Напишите класс, который принимает с клавиатуры положительное
    двузначное число, а затем вычисляет и выводит на экран его «степень четности».
 */
public class Task_4_13 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 2;
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        count -= firstDigit % 2;
        count -= secondDigit % 2;

        System.out.println(count);
    }
}
