package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число х, а
    затем - серию из 29 дополнительных целых чисел (вводимых с клавиатуры).
    Класс должен определить, сколько чисел в серии были равны значению
    переменной х, а сколько - были меньше значения переменной х.
 */
public class Task_12_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int equalsCount = 0;
        int lessCount = 0;

        for (int i = 0; i < 29; i++) {
            int number = scanner.nextInt();

            if (number == x) {
                equalsCount++;
            }

            if (number < x) {
                lessCount++;
            }
        }

        System.out.println("Количество чисел равных x: " + equalsCount);
        System.out.println("Количество чисел меньше x: " + lessCount);
        scanner.close();
    }
}
