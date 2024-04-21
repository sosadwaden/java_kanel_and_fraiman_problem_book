package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число N и выводит на экран серию N+(N-1)+(N-2)+...+ 1, то есть серию
    целых положительных последовательных чисел, начиная с введенного
    с клавиатуры значения и до 1 (числа при выводе на экран
    должны разделяться знаком+).
 */
public class Task_11_52 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            if (i != 1) {
                System.out.print(i + "+");
            } else {
                System.out.print(i);
            }
        }

        scanner.close();
    }
}
