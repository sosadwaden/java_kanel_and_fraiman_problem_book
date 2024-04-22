package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и определяет,
    является ли оно точным квадратом целого числа.
 */
public class Task_15_36 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = 1;
        String msg = " не является точным квадратом целого числа.";

        while (square * square <= number) {
            if (square * square == number) {
                msg = " является точным квадратом целого числа.";
                break;
            }
            square++;
        }

        System.out.println(number + msg);
        scanner.close();
    }
}
