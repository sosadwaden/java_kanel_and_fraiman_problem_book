package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вначале принимает с клавиатуры целое положительное
    число (в переменную х). Затем класс выводит на экран в
    строку серию из 17 целых положительных чисел, отвечающую следующим условиям:
    1) серия начинается с числа, меньшего х на 10;
    2) каждое число в серии (начиная со второго) меньше предыдущего на 6.
    Числа должны отделяться друг от друга знаком «пробел». Перед началом
    и после окончания вывода серии чисел на экран вывода следует
    вывести текстовые сообщения (по выбору).
 */
public class Task_11_22 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int currentNumber = number - 10;

        System.out.println("Начало");


        for (int i = 1; i <= 16; i++) {
            System.out.println(currentNumber + " ");
            currentNumber -= 6;
        }

        System.out.print("\nКонец");
        scanner.close();
    }
}
