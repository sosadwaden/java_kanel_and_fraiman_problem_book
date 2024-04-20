package section4_operators_calculation_of_the_remainder_and_calculation_of_the_quotient;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры положительное
    трехзначное число, а затем вычисляет и выводит на экран его «степень четности».
 */
public class Task_4_14 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 3;
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        count -= firstDigit % 2;
        count -= secondDigit % 2;
        count -= thirdDigit % 2;

        System.out.println(count);
        scanner.close();
    }
}
