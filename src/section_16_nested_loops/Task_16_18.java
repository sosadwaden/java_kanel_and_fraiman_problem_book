package section_16_nested_loops;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и выводит на экран все его делители, которые являются простыми числами.
 */
public class Task_16_18 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 2; i < number; i++) {

            int flag = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0 && number % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
