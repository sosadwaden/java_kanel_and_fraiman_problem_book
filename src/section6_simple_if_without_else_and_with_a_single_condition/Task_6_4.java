package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и, если
    оно положительное, увеличивает его вдвое. Класс должен выводить на
    экран новое значение.
 */
public class Task_6_4 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            number *= 2;
            System.out.println(number * 2);
        }

        scanner.close();
    }
}
