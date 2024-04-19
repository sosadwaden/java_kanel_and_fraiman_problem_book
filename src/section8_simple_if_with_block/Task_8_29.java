package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры две пары целых
    ненулевых чисел: первая пара является числителем и знаменателем одной
    дроби, вторая пара - числителем и знаменателем другой дроби.
    Класс должен проверить, равны ли эти дроби друг другу, и вывести на
    экран соответствующее текстовое сообщение.
 */
public class Task_8_29 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b != 0 && a > b) {
            int c = a / b;
            a -= c * b;
            System.out.println(c + " " + a + "/" + b);
        } else {
            System.out.println("Подсчет не производится");
        }
    }
}
