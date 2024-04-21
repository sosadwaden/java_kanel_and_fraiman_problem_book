package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран 18 последующих ему чисел.
 */
public class Task_11_34 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        for (int i = 1; i <= 18; i++) {
            number++;
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
