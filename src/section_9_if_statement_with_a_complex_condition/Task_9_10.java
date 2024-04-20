package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры три целых числа и
    определяет, в каких соотношениях с точки зрения значений (равны,
    больше, меньше) они находятся. На экран следует вывести сообщение с
    точным указанием результатов проверки: например, Первое и третье
    равны, второе больше них или Все значения одинаковы.
 */
public class Task_9_10 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Все значения одинаковы.");
        } else if (num1 == num2) {
            System.out.println("Первое и второе равны, третье " + ((num3 > num1) ? "больше" : "меньше") + " них.");
        } else if (num1 == num3) {
            System.out.println("Первое и третье равны, второе " + ((num2 > num1) ? "больше" : "меньше") + " них.");
        } else if (num2 == num3) {
            System.out.println("Второе и третье равны, первое " + ((num1 > num2) ? "больше" : "меньше") + " них.");
        } else {
            System.out.println("Все числа различны.");
        }

        scanner.close();
    }
}
