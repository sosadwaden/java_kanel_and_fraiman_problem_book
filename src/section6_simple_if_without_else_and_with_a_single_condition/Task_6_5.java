package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и, если
    оно равно нулю, выводит на экран сообщение Ноль.
 */
public class Task_6_5 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Zero");
        }

        scanner.close();
    }
}
