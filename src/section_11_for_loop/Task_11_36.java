package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран 10 предшествующих ему чисел, причем разница между
    значениями этих чисел должна быть равна 6.
 */
public class Task_11_36 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print((number - 6 * i) + " ");
        }

        scanner.close();
    }
}
