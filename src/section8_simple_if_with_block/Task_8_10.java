package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран его квадрат, но только в случае, если введенное число
    отрицательно. В противном случае - на экран выводится сообщение Ошибка.
 */
public class Task_8_10 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println(a * 2);
        } else {
            System.out.println("Ошибка");
        }
    }
}
