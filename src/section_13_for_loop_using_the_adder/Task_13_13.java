package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры оценки 30 учеников
    класса и выводит на экран:
    • среднюю арифметическую оценку учеников, получивших удовлетворительные оценки;
    • среднюю арифметическую оценку учеников, получивших неудовлетворительные оценки.
    Что произойдет при исполнении программы, если все 30 учеников получили
    удовлетворительные оценки?
    ------------------------------------------------------------------------------------------
    Может выброситься исключение ArithmeticException: / by zero - деление на ноль
 */
public class Task_13_13 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int countSatScores = 0;
        int countBadScores = 0;
        int sumSatScores = 0;
        int sumBadScores = 0;

        for (int i = 0; i < 30; i++) {
            int score = scanner.nextInt();

            if (score == 2) {
                sumBadScores += score;
                countBadScores++;
            }
            if (score == 3) {
                sumSatScores += score;
                countSatScores++;
            }
        }

        System.out.println("Среднее арифметическое удовлетворительных оценок: " + (sumSatScores / countSatScores));
        System.out.println("Среднее арифметическое неудовлетворительных оценок: " + (sumBadScores / countBadScores));
        scanner.close();
    }
}
