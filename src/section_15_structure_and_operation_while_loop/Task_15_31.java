package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры серию целых чисел
    до тех пор, пока количество четных чисел в серии остается меньше 5.
 */
public class Task_15_31 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                count++;
            }
        }

        scanner.close();
    }
}
