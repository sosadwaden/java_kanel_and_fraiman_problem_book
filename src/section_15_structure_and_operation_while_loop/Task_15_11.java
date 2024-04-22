package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры пары двузначных
    целых чисел, пока не будет введена пара одинаковых чисел.
    Класс должен выводить на экран сумму всех первых чисел в парах и
    сумму всех вторых чисел в парах (не считая чисел, введенных в последней паре).
 */
public class Task_15_11 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == b) {
                break;
            }
            sum1 += a;
            sum2 += b;
        }

        System.out.print("Сумма1: " + sum1 + "\nСумма2: " + sum2);
        scanner.close();
    }
}
