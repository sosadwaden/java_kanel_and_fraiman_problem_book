package section_12_for_loop_using_the_counter;

import java.util.Scanner;
/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и определяет, является ли оно простым.
    Класс должен вывести на экран соответствующее текстовое сообщение.
 */
public class Task_12_16 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && number > 1) {
            System.out.println("Число " + number + " является простым");
        } else {
            System.out.println("Число " + number + " не является простым");
        }
        scanner.close();
    }
}
