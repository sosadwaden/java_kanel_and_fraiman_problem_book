package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа и
    выводит на экран следующие значения (каждое в отдельной строке):
    квадрат каждого числа (отдельно) и сумму квадратов введенных чисел.
 */
public class Task_2_23 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * a + b * b;

        System.out.println(a * a);
        System.out.println(b * b);
        System.out.println(c);
    }
}
