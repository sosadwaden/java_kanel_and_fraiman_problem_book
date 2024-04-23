package section_18_array_description_initialization_properties;

import java.util.Scanner;

/*
    Задание: Напишите класс, который заполняет случайными двузначными числами
    массив, размер которого при инициализации вводится с клавиатуры.
    После заполнения класс должен вывести на экран значения массива следующим образом:
    • в первой строке - значения из четных ячеек массива;
    • во второй строке - значения из нечетных ячеек массива.
 */
public class Task_18_15 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] m = new int[length];
        int down = 10;
        int up = 99;

        fill(m, down, up);
        write(m);
        scanner.close();
    }

    public void write(int[] m) {
        for (int i = 0; i < m.length; i += 2) {
            System.out.print(m[i] + " ");
        }

        System.out.println();

        for (int i = 1; i < m.length; i += 2) {
            System.out.print(m[i] + " ");
        }
    }

    public void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = down + (int) ((up - down) * Math.random());
        }
    }
}
