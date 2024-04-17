package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание:Напишите класс, который принимает с клавиатуры три целых числа,
    каждое из которых представляет собой размер одной из сторон параллелепипеда
    и выводит на экран следующие значения (каждое - в отдельной
    строке): объем, площадь каждой из граней, общую площадь и общий периметр.
 */
public class Task_2_25 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("V = " + (a * b * c));
        System.out.println("S = " + (2 * (a * b + b * c + a * c)));
        System.out.println("S1 = " + a * b);
        System.out.println("S2 = " + b * c);
        System.out.println("S3 = " + a * c);
        System.out.println("P = " + (4 * a + 4 * b + 4 * c));
    }
}
