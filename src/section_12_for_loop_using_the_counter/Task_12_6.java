package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и проверяет,
    на какое количество двузначных чисел оно делится.
    Результат проверки класс должен вывести на экран вместе с соответствующим текстовым сообщением.
 */
public class Task_12_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 10; i < 100; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        System.out.println("Введенное число делится на " + count + " двузначных чисел.");
        scanner.close();
    }
}
