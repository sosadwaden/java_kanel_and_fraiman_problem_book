package section7_simple_if_with_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и определяет,
    является оно положительным или нет, и выводит на экран одно из двух
    соответствующих результатам проверки сообщений: Положительное число и Не положительное число.
 */
public class Task_7_5 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
}
