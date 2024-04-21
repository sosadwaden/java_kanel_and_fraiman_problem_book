package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Для участия в финале конкурса участники двух предварительных этапов
    должны были набрать не менее 80 баллов (на каждом предварительном
    этапе можно было получить максимум 50 баллов).
    Напишите класс, который принимает с клавиатуры данные 12 участников
    конкурса - в виде количества баллов, которые получил каждый участник
    на первом и втором предварительном этапе.
    Для каждого участника класс должен определить, проходит ли он в финал,
    или нет - и вывести на экран соответствующее сообщение (вместе
    с общим количеством баллов, которое набрал участник).
 */
public class Task_13_29 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 12; i++) {
            System.out.println("Участник " + i + ":");
            System.out.print("Количество баллов на первом этапе: ");
            int firstStageScore = scanner.nextInt();

            System.out.print("Количество баллов на втором этапе: ");
            int secondStageScore = scanner.nextInt();

            int totalScore = firstStageScore + secondStageScore;
            System.out.println("Общее количество баллов: " + totalScore);

            if (totalScore >= 80) {
                System.out.println("Участник проходит в финал.");
            } else {
                System.out.println("Участник не проходит в финал.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
