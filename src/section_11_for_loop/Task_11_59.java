package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который читает два целых положительных числа в
    переменных А и В и проверяет, действительно ли А меньше, чем В.
    Если да, — класс должен вывести на экран А последовательных чисел,
    начиная с числа В, если нет, — класс должен вывести на экран В последовательных
    чисел, начиная с числа А.
 */
public class Task_11_59 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A < B) {
            for (int i = 0; i < A; i++) {
                System.out.print(B + i + " ");
            }
        } else {
            for (int i = 0; i < B; i++) {
                System.out.print(A + i + " ");
            }
        }

        scanner.close();
    }
}
