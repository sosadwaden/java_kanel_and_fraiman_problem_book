package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры положительное
    целое число и выводит на экран все его делители.
    Кроме того, класс должен определять количество и сумму делителей и
    выводить результаты на экран.
 */
public class Task_13_4 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }

        System.out.println("\nКоличество делителей: " + count);
        System.out.println("Сумма делителей: " + sum);

        scanner.close();
    }
}
