package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который вначале принимает с клавиатуры целое положительное число.
    Затем класс выводит на экран в строку положительные двузначные
    числа, произведение цифр которых меньше введенного с клавиатуры
    значения. Числа должны отделяться друг от друга знаком «пробел».
    Перед началом и после окончания вывода серии чисел на экран вывода
    следует вывести текстовые сообщения (по выбору).
 */
public class Task_11_30 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Начало");

        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;

            if (firstDigit * secondDigit < number) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nКонец");
        scanner.close();
    }
}
