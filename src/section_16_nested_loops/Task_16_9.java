package section_16_nested_loops;

import java.util.Scanner;

/*
    Задание: Напишите класс для графического изображения делимости чисел
    от 1 до n (значение переменной n вводится с клавиатуры). В каждой
    строке надо вывести число и столько плюсов, сколько делителей у этого
    числа (считая и единицу, и само число). Например, если исходное
    данное - число 4, то на экран должно быть выведено:
    1+
    2++
    3++
    4+++
 */
public class Task_16_9 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    System.out.print("+");
            }
            System.out.println();
        }

        scanner.close();
    }
}
