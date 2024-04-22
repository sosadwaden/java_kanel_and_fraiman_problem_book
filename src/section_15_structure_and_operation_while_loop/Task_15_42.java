package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Последовательность Фибоначчи определяется как серия чисел, в которой
    первый и второй члены равны 1, а любой член, начиная с третьего,
    равен сумме двух предыдущих членов.
    Напишите класс, который принимает с клавиатуры целое положительное
    число и проверяет, является ли оно членом последовательности Фибоначчи.
 */
public class Task_15_42 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        boolean exists = false;

        while (c < n) {
            c = a + b;

            if (c == n) {
                exists = true;
                break;
            }

            a = b;
            b = c;
        }

        if (exists) {
            System.out.println("Число " + n + " является членом последовательности Фибоначчи.");
        } else {
            System.out.println("Число " + n + " не является членом последовательности Фибоначчи.");
        }
        scanner.close();
    }
}
