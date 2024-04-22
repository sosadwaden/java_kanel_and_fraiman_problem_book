package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: При внесении в компьютерную программу оценок группы из 30 учеников
    учитель может допустить ошибку (ввести число, не являющееся
    оценкой). Компьютерная программа игнорирует ошибку, а учитель получает
    возможность вновь занести с клавиатуры оценку.
    Напишите класс, который принимает с клавиатуры оценки 30 учеников
    до тех пор, пока все ученики не получат оценки. Класс должен подсчитать
    среднюю арифметическую оценку группы, а также количество
    ошибок, допущенных при введении оценок.
 */
public class Task_15_50 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfStudents = 0;
        int numberOfErrors = 0;

        while (numberOfStudents < 30) {
            System.out.print("Введите оценку ученика " + (numberOfStudents + 1) + ": ");
            if (scanner.hasNextInt()) {

                int mark = scanner.nextInt();

                if (mark >= 1 && mark <= 10) {
                    totalMarks += mark;
                    numberOfStudents++;
                } else {
                    numberOfErrors++;
                    System.out.println("Ошибка: оценка должна быть в диапазоне от 1 до 10.");
                }
            } else {
                numberOfErrors++;
                System.out.println("Ошибка: введено не число.");
                scanner.next(); // Очистка ввода
            }
        }

        double averageMark = (double) totalMarks / numberOfStudents;
        System.out.println("Средняя арифметическая оценка группы: " + averageMark);
        System.out.println("Количество ошибок при вводе оценок: " + numberOfErrors);
        scanner.close();
    }
}
