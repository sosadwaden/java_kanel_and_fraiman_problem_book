package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и выводит на экран его первую цифру.
    Например, для числа 7659 на экран будет выведено 7.
 */
public class Task_15_25 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number >= 10) {
            number /= 10;
        }

        System.out.println(number);
        scanner.close();
    }
}
