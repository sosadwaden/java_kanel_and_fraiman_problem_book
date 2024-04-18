package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и, если оно как минимум трехзначное и положительное,
    уменьшает его на 1.
 */
public class Task_6_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 100) {
            number -= 1;
            System.out.println(number);
        }
    }
}
