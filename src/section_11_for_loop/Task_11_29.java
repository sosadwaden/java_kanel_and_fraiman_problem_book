package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вначале принимает с клавиатуры целое положительное число.
    Затем класс выводит на экран в строку положительные трехзначные
    числа, в которых последняя цифра такая же, как и последняя цифра в
    значении, введенном с клавиатуры. Числа должны отделяться друг от
    друга знаком «пробел». Перед началом и после окончания вывода серии
    чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */
public class Task_11_29 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastDigit = number % 10;

        System.out.println("Начало");

        for (int i = 100; i < 1000; i++) {

            if (i % 10 == lastDigit) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nКонец");
        scanner.close();
    }
}
