package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры серию целых чисел
    до тех пор, пока количество четных чисел на нечетных местах в серии остается меньше 5.
 */
public class Task_15_32 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int evenOnOddPositionsCount = 0;
        int position = 1;

        while (evenOnOddPositionsCount < 5) {
            int number = scanner.nextInt();

            if (position % 2 != 0 && number % 2 == 0) {
                evenOnOddPositionsCount++;
            }

            position++;
        }

        scanner.close();
    }
}
