package section_14_for_loop_determining_the_maximum_and_minimum;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры серию из 27 целых
    чисел и сравнивает два значения: среднее арифметическое максимума
    и минимума, и среднее арифметическое всех значений серии.
 */
public class Task_14_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < 27; i++) {
            int number = scanner.nextInt();
            count++;
            sum += number;

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.print("Сравнение среднего арифметического максимума и минимума, и среднего арифметического всех значений серии: ");
        System.out.println((max + min) / 2 > (sum / count));
        scanner.close();
    }
}
