package section_14_for_loop_determining_the_maximum_and_minimum;

import java.util.Scanner;

/*
    Задание: В соревнованиях по бегу принимали участие 150 учеников школы.
    Напишите класс, который принимает с клавиатуры время, показанное
    в соревнованиях каждым из учеников, и выводит на экран наилучший
    результат, а также порядковый номер победителя (можно предположить,
    что есть только один победитель).
 */
public class Task_14_2 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        int bestTime = Integer.MAX_VALUE;
        int winnerNumber = -1;

        System.out.println("Введите время каждого участника:");

        for (int i = 1; i <= 150; i++) {
            System.out.print("Участник " + i + ": ");
            int time = scanner.nextInt();

            if (time < bestTime) {
                bestTime = time;
                winnerNumber = i;
            }
        }

        System.out.println("Наилучший результат: " + bestTime);
        System.out.println("Номер победителя: " + winnerNumber);
        scanner.close();
    }
}
