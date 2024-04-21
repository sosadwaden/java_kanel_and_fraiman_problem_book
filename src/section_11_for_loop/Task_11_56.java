package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых положительных
    числа: N и М (неизвестно, какое из введенных чисел больше).
    Класс должен вывести на экран все целые числа, начиная с N и заканчивая М.
 */
public class Task_11_56 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int min = Math.min(N, M);
        int max = Math.max(N, M);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
