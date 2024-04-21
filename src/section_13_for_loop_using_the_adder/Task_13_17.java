package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Последовательность Фибоначчи - последовательность целых чисел,
    построенная по следующему правилу: каждый член последовательности,
    начиная с 3-го, равен сумме двух предыдущих.
    Напишите класс, который получает с клавиатуры два первых члена последовательности
    и целое положительное число N. Класс подсчитает и выведет
    на экран сумму первых N членов последовательности Фибоначчи.
 */
public class Task_13_17 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый член последовательности: ");
        int first = scanner.nextInt();
        System.out.print("Введите второй член последовательности: ");
        int second = scanner.nextInt();

        System.out.print("Введите количество членов последовательности для суммирования (N): ");
        int N = scanner.nextInt();

        int sum = first + second;

        for (int i = 3; i <= N; i++) {
            int next = first + second;
            sum += next;
            first = second;
            second = next;
        }

        System.out.println("Сумма первых " + N + " членов последовательности Фибоначчи: " + sum);
        scanner.close();
    }
}
