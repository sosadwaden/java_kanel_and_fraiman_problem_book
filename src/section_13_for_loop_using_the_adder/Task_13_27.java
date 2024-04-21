package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры три целых числа и
    проверяет, являются ли они тремя последовательными членами арифметической прогрессии.
    В случае если являются, класс должен вывести на экран еще 14 следующих
    членов этой же прогрессии; в ином случае - вывести на экран
    соответствующее текстовое сообщение.
 */
public class Task_13_27 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d1 = b - a;
        int d2 = c - b;

        if (d1 != d2) {
            System.out.println("Нет");
        }
        else {
            for (int i = 0; i <= 14; i++) {
                c += d2;
                System.out.print(c + " ");
            }
        }

        scanner.close();
    }
}
