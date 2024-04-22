package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и строит из него число с обратным порядком цифр.
    Новое значение следует вывести на экран.
 */
public class Task_15_35 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }

        scanner.close();
    }
}
