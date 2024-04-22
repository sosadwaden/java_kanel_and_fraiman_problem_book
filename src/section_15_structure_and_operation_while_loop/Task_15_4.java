package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры числа, пока не будет
    введено значение 0. Для каждого введенного с клавиатуры положительного
    числа класс должен выводить на экран текст Плюс, для
    каждого отрицательного - текст Минус.
 */
public class Task_15_4 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number != 0) {

            if (number > 0) {
                System.out.println("Плюс");
            }
            if (number < 0) {
                System.out.println("Минус");
            }

            number = scanner.nextInt();
        }

        scanner.close();
    }
}
