package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры двузначное положительное
    целое число Х, составленное из разных цифр, и возвращает
    сумму однозначных чисел, заключенных между цифрами этого числа Х
    (включая сами цифры, из которых составлено число Х).
    Например, и для числа 52, и для числа 25 будет возвращено значение
    14 (2 + 3 + 4 + 5 = 14).
 */
public class Task_13_15 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        int firstDigit = number / 10;
        int lastDigit = number % 10;

        int min = Math.min(firstDigit, lastDigit);
        int max = Math.max(firstDigit, lastDigit);

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.println("Сумма однозначных чисел между цифрами числа " + number + " равна " + sum);

        scanner.close();
    }
}
