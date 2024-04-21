package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры 17 целых чисел и
    выводит на экран информацию о том, сколько из них были больше, чем предыдущее число.
 */
public class Task_12_4 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int prevNumber = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < 17; i++) {
            int number = scanner.nextInt();

            if (number > prevNumber) {
                count++;
            }

            prevNumber = number;
        }

        System.out.println("Количество чисел, больших предыдущего числа: " + count);
        scanner.close();
    }
}
