package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры 12 целых чисел и
    выводит на экран информацию о том, сколько из них были больше, чем первое число.
 */
public class Task_12_3 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < 12; i++) {
            int number = scanner.nextInt();

            if (number > firstNumber) {
                count++;
            }
        }

        System.out.println("Количество чисел, больших первого числа: " + count);
        scanner.close();
    }
}
