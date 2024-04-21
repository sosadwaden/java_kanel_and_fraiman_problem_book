package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число Х и выводит на экран все его делители (1 и само число Х
    не считать делителями).
    Класс должен также подсчитать количество этих делителей и вывести
    результат на экран вместе с соответствующим по смыслу текстовым сообщением.
 */
public class Task_12_15 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int divisorCount = 0;

        System.out.print("Делители числа " + x + ": ");

        for (int i = 2; i <= x / 2; i++) {

            if (x % i == 0) {
                System.out.print(i + " ");
                divisorCount++;
            }
        }
        System.out.println();

        System.out.println("Количество делителей числа " + x + ": " + divisorCount);
        scanner.close();
    }
}
