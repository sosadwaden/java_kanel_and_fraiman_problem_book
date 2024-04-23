package section_18_array_description_initialization_properties;

import java.util.Scanner;

/*
    Задание: Напишите класс, который заполняет случайными трехзначными числами
    массив, размер которого при инициализации вводится с клавиатуры.
    После заполнения класс должен вывести на экран значения массива
    следующим образом: в каждой строке выводится значения из двух ячеек,
    симметрично расположенных по отношению к середине массива.
    В случае если массив имеет нечетный размер, центральную ячейку
    следует выводить в отдельной строке.
    Например, массив 345, 455, 677, 175, 985 выводится на экран следующим
    образом:
    345 и 985
    455 и 175
    677
 */
public class Task_18_17 {

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
        int halfSize = m.length / 2;

        if (m.length % 2 == 0) {
            for (int i = 0; i < halfSize; i++) {
                System.out.println(m[i] + " и " + m[m.length - 1 - i]);
            }
        } else {
            for (int i = 0; i < halfSize; i++) {
                System.out.println(m[i] + " и " + m[m.length - 1 - i]);
            }
            System.out.println(m[halfSize]);
        }
    }

    public void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = down + (int) ((up - down) * Math.random());
        }
    }
}
