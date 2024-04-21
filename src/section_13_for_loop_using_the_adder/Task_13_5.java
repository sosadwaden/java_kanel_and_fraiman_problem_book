package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Назовем «базой» положительного числа Х сумму всех положительных целых чисел, меньших Х.
    Напишите класс, который принимает с клавиатуры положительное
    целое число Х и подсчитывает его «базу».
 */
public class Task_13_5 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            sum += i;
        }

        System.out.println("База числа " + number + " равна " + sum);

        scanner.close();
    }
}
