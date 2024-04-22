package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и подсчитывает
    количество нулей в этом числе. Результат подсчета надо вывести на экран.
 */
public class Task_15_30 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;

        while (number != 0) {
            if (number % 10 == 0)
                count++;
            number /= 10;
        }

        System.out.println(count);
        scanner.close();
    }
}
