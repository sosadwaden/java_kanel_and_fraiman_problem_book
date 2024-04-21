package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
    • среднюю арифметическую оценку класса;
    • число учеников, получивших неудовлетворительные оценки.
 */
public class Task_13_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int countBadScores = 0;
        int sum = 0;

        for (int i = 0; i < 30; i++) {
            int score = scanner.nextInt();

            if (score == 2) {
                countBadScores++;
            }

            sum += score;
        }

        System.out.println("Среднее арифметическое всех оценок: " + (sum / 30));
        System.out.println("Количество плохих оценок: " + countBadScores);
        scanner.close();
    }
}
