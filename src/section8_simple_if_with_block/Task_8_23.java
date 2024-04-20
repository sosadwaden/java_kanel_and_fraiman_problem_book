package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа и
    изменяет их следующим образом:
    • при разных значениях, большее число уменьшается на 1, а меньшее - увеличивается на 1;
    • при одинаковых значениях чисел оба увеличиваются на 1.
    Программа должна вывести на экран новые значения переменных.
 */
public class Task_8_23 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            a++;
            b++;
        }

        if (a > b) {
            a++;
            b--;
        }

        if (b > a) {
            b++;
            a--;
        }

        System.out.println(a + " " + b);
        scanner.close();
    }
}
