package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число N,
    а затем принимает с клавиатуры N целых чисел.
    Для каждого вводимого с клавиатуры неотрицательного числа следует
    вывести на экран его квадрат, а для остальных чисел - текст Пропускаем.
 */
public class Task_11_58 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.print((number * number) + " ");
            }
        }

        scanner.close();
    }
}
