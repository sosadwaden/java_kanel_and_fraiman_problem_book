package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран 25 последующих ему нечетных чисел.
 */
public class Task_11_35 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 25; i++) {
            System.out.print((number + 2 * i) + " ");
        }

        scanner.close();
    }
}
