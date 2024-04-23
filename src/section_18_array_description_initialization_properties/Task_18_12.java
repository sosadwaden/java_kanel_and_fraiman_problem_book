package section_18_array_description_initialization_properties;

import java.util.Scanner;

/*
    Задание: Напишите класс, который заполняет случайными трехзначными числами
    массив, размер которого при инициализации вводится с клавиатуры.
    После заполнения класс должен вывести на экран значения массива в
    одной строке, начиная с «начала» массива (с первой ячейки).
 */
public class Task_18_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] m = new int[length];
        int down = 100;
        int up = 999;

        fill(m, down, up);
        write(m);
        scanner.close();
    }

    public void write(int[] m) {
        System.out.print("[");
        for (int i = 0; i < m.length; i++) {
            if (i + 1 == m.length) {
                System.out.print(m[i] + "]");
            } else {
                System.out.print(m[i] + ", ");
            }
        }
    }

    public void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = down + (int) ((up - down) * Math.random());
        }
    }
}
