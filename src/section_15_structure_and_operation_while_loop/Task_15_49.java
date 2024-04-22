package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры оценки, полученные
    группой учеников, и определяет среднюю арифметическую оценку в группе.
    Ввод данных завершается, когда очередное вводимое с клавиатуры
    значение не является оценкой.
 */
public class Task_15_49 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfStudents = 0;

        while (true) {
            System.out.print("Введите оценку ученика (или любое другое значение для завершения ввода): ");
            if (scanner.hasNextInt()) {
                int mark = scanner.nextInt();
                totalMarks += mark;
                numberOfStudents++;
            } else {
                break;
            }
        }

        if (numberOfStudents > 0) {
            double averageMark = (double) totalMarks / numberOfStudents;
            System.out.println("Средняя арифметическая оценка в группе: " + averageMark);
        } else {
            System.out.println("В группе нет учеников.");
        }
        scanner.close();
    }
}
