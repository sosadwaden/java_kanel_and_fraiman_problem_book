package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Назовем «дважды четным» целое положительное число, если и оно само,
    и сумма его делителей - четные числа.
    Напишите класс, который принимает с клавиатуры целое положительное
    число и проверяет, является ли оно «дважды четным».
 */
public class Task_13_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (number % 2 == 0 && sum % 2 == 0) {
            System.out.println("Число " + number + " является дважды четным.");
        } else {
            System.out.println("Число " + number + " не является дважды четным.");
        }

        scanner.close();
    }
}
