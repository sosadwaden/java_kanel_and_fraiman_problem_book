package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вначале принимает с клавиатуры целое положительное
    число (в переменную х). Затем класс выводит на экран в
    строку серию из 17 целых положительных чисел, отвечающую следующим
    условиям:
    1) серия начинается с числа, большего х на 1;
    2) каждое число в серии (начиная со второго) больше предыдущего на 1.
    Числа должны отделяться друг от друга знаком «пробел». Перед началом
    и после окончания вывода серии чисел
 */
public class Task_11_21 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Начало");

        for (int i = (number + 1); i <= (number + 17); i++) {
            System.out.println(i+ " ");
        }

        System.out.print("\nКонец");
        scanner.close();
    }
}
