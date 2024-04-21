package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число N и выводит на экран серию 1+2+3+...+N, то есть серию целых положительных
    последовательных чисел, начиная с 1 и до введенного с клавиатуры
    значения (числа при выводе на экран должны разделяться знаком + ).
 */
public class Task_11_51 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i != number) {
                System.out.print(i + "+");
            } else {
                System.out.print(i);
            }
        }

        scanner.close();
    }
}
