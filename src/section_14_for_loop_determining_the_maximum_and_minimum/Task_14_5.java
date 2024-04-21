package section_14_for_loop_determining_the_maximum_and_minimum;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры серию из 12 целых
    чисел и определяет среднее арифметическое максимума и минимума
    для этой серии.
 */
public class Task_14_5 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 12; i++) {
            int number = scanner.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println((max + min) / 2);
        scanner.close();
    }
}
