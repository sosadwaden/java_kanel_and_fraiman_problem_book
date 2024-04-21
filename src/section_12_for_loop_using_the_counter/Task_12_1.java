package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры 10 целых чисел и выводит
    на экран информацию о том, сколько из них бьmи положительными.
 */
public class Task_12_1 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number > 0) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
