package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры оценку ученика
    (целое число) и проверяет, не является ли введенное значение ошибочным.
    На экран должно выводиться соответствующее текстовое сообщение.
 */
public class Task_8_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean correctNumber = number >= 2 && number <= 5;

        if (correctNumber) {
            System.out.println("Верная оценка");
        } else {
            System.out.println("Ошибочная оценка");
        }
    }
}
