package section_18_array_description_initialization_properties;

import java.util.Scanner;

/*
    Задание: Напишите класс, который заполняет случайными трехзначными числами
    массив, размер которого при инициализации вводится с клавиатуры.
    После заполнения класс должен вывести на экран значения массива
    следующим образом:
    • в первой строке - первую половину массива;
    • во второй строке - вторую половину массива.
    В случае если массив имеет нечетный размер, центральную ячейку
    следует выводить в первой строке.
 */
public class Task_18_14 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int down = 100, up = 999;
        int[] m = new int[length];
        fill(m, down, up);
        write(m);
        scanner.close();
    }
    public void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = down + (int) ((up - down) * Math.random());
        }
    }
    public void write(int[] m) {
        int halfSize = m.length / 2;

        if (m.length % 2 == 0) {
            for (int i = 0; i < halfSize; i++) {
                System.out.print(m[i] + " ");
            }
            System.out.println();
            for (int i = halfSize; i < m.length; i++) {
                System.out.print(m[i] + " ");
            }
        } else {
            for (int i = 0; i <= halfSize; i++) {
                System.out.print(m[i] + " ");
            }
            System.out.println();
            for (int i = halfSize + 1; i < m.length; i++) {
                System.out.print(m[i] + " ");
            }
        }
    }
}
