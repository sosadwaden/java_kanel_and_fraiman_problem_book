package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры 15 целых чисел и
    выводит на экран информацию о том, сколько из них были четными и сколько нечетными.
 */
public class Task_12_2 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 15; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.printf("Чётных: %d, нечётных: %d", evenCount, oddCount);
        scanner.close();
    }
}
