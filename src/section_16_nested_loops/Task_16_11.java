package section_16_nested_loops;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число, а затем
    проверяет, можно ли представить его в виде суммы квадратов двух целых чисел.
 */
public class Task_16_11 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i * i <= number; i++) {
            for (int j = 0; j * j <= number; j++) {
                if (i * i + j * j == number) {
                    System.out.println("Число " + number + " можно представить в виде суммы квадратов чисел " + i + " и " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Число " + number + " нельзя представить в виде суммы квадратов двух целых чисел.");
        }

        scanner.close();
    }
}
