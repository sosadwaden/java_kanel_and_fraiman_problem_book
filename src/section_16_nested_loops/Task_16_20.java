package section_16_nested_loops;

/*
    Задание: В классе 35 учеников. В конце учебного года каждый ученик получает ведомость
    с оценками по 8 предметам. Напишите класс, который генерирует по 8
    оценок для каждого ученика и подсчитывает для него среднюю годовую оценку.
    Для каждого ученика класс должен выводить на экран в одну строку
    оценки каждого ученика и его среднюю годовую оценку.
    После завершения вывода на экран оценок всех учеников класс должен
    выводить в отдельной строке количество учеников, у которых среднегодовая
    оценка выше 4.5, и наивысшую среднегодовую оценку.
 */
public class Task_16_20 {

    public void action() {
        int numberSubjects = 8;
        int aboveAverageCount = 0;
        double highestAverage = 0;

        for (int student = 1; student <= 35; student++) {
            System.out.print("Студент " + student + ": ");
            int sum = 0;

            for (int subject = 1; subject <= numberSubjects; subject++) {
                int grade = (int) (Math.random() * 5) + 1; // Генерация оценки от 1 до 5
                System.out.print(grade + " ");
                sum += grade;
            }

            double average = (double) sum / numberSubjects;

            if (average > highestAverage) {
                highestAverage = average;
            }

            if (average > 4.5) {
                aboveAverageCount++;
            }

            System.out.println("- средняя годовая оценка: " + average);
        }

        System.out.println("Количество студентов с среднегодовой оценкой выше 4.5: " + aboveAverageCount);
        System.out.println("Наивысшая среднегодовая оценка: " + highestAverage);
    }
}
