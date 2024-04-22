package section_16_nested_loops;

import java.util.Scanner;

/*
    Задание: Напишите класс, который читает с клавиатуры целые положительные
    числа и для каждого числа выводит на экран: число цифр в числе, сумму
    цифр числа и число делителей введенного числа. Класс также должен подсчитать
    и вывести на экран общую сумму всех цифр введенных чисел.
 */
public class Task_16_21 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;

        while (true) {
            System.out.print("Введите целое положительное число (для выхода введите 0): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            int numDigits = Integer.toString(number).length();

            int sum = 0;
            int tempNumber = number;

            while (tempNumber > 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }

            int divisorsCount = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisorsCount++;
                }
            }

            System.out.println("Число цифр: " + numDigits);
            System.out.println("Сумма цифр: " + sum);
            System.out.println("Число делителей: " + divisorsCount);

            totalSum += sum;
        }

        System.out.println("Общая сумма всех цифр: " + totalSum);
        scanner.close();
    }
}
