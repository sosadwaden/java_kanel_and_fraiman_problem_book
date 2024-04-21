package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вначале принимает с клавиатуры целое положительное
    число (в переменную х). Затем класс выводит на экран в
    строку все целые числа из диапазона -|x|...|x| (не включая крайние значения
    диапазона). Числа должны отделяться друг от друга знаком
    «пробел». Перед началом и после окончания вывода серии чисел на
    экран вывода следует вывести текстовые сообщения (по выбору).
 */
public class Task_11_26 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(scanner.nextInt());

        System.out.println("Начало");

        for (int i = -number + 1; i < number; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\nКонец");
        scanner.close();
    }
}
