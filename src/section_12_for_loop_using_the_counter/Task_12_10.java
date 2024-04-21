package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Контрольная работа считается «провальной», если более половины
    учеников получили неудовлетворительные оценки.
    Напишите класс, который принимает с клавиатуры число учеников в
    группе, а затем - оценку каждого ученика.
    Класс должен определить, была ли контрольная «провальной».
 */
public class Task_12_10 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int score = scanner.nextInt();

            if (score == 2) {
                count++;
            }
        }

        if (count * 2 > numberOfStudents) {
            System.out.println("Провальная контрольная");
        } else {
            System.out.println("Нет");
        }

        scanner.close();
    }
}
