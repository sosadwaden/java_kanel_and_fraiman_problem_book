package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вводит с клавиатуры целые положительные
    числа до тех пор, пока не будет введено число, сумма цифр которого равна 5.
 */
public class Task_15_20 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum == 5) {
                break;
            }
        }

        scanner.close();
    }
}
