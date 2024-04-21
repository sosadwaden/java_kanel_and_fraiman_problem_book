package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Определим как «удивительное» целое положительное число Х, для которого
    выполняется следующее условие: сумма всех целых положительных
    чисел, меньших Х и являющихся делителями Х, равно Х.
    Например, число 28 является «удивительным», потому что
    1+2+4 + 7 + 14 = 28.
    Напишите класс, который принимает в качестве параметра целое положительное
    число, проверяет, является ли оно «удивительным», и выводит
    на экран соответствующее текстовое сообщение.
 */
public class Task_13_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("Число " + number + " является удивительным.");
        } else {
            System.out.println("Число " + number + " не является удивительным.");
        }

        scanner.close();
    }
}
