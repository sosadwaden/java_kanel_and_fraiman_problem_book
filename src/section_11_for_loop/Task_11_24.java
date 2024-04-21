package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вначале принимает с клавиатуры целое положительное
    число (в переменную х). Затем класс выводит на экран в
    строку серию из 2х убывающих чисел, начиная с О; разница между соседними
    значениями в серии равна 8. Числа должны отделяться друг от
    друга знаком «пробел». Перед началом и после окончания вывода серии
    чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */
public class Task_11_24 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 0;

        System.out.println("Начало");

        for (int i = 0; i < 2; i++) {
            System.out.print((number - i * 8) + " ");
        }

        System.out.print("\nКонец");
        scanner.close();
    }
}
