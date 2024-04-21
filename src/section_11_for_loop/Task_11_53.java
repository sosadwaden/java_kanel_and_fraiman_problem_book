package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых положительных
    числа: N и М (можно считать, что M<N).
    Класс должен вывести на экран серию М+(М+1)+(М+2)+...+N.
 */
public class Task_11_53 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int sum = 0;

        for (int i = M; i <= N; i++) {
            sum += i;
        }

        System.out.println("Серия " + M + "+(" + M + "+1)+(" + M + "+2)+...+" + N + " равна " + sum);

        scanner.close();
    }
}
