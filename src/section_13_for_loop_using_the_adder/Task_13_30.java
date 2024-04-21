package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Производственный участок выпускает стальные шарики, диаметр которых
    должен быть равен 24 миллиметрам (допустимое отклонение не
    более 2 миллиметров), а вес - 74 граммам (допустимое отклонение не более 3 грамм).
    Напишите класс, который принимает данные 120 шариков, для каждого
    из них определяет, соответствуют ли его параметры указанным
    стандартам, и выводит на экран для каждого шарика соответствующее
    текстовое сообщение.
 */
public class Task_13_30 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 120; i++) {
            System.out.println("Шарик " + i + ":");
            System.out.print("Диаметр (в миллиметрах): ");
            double diameter = scanner.nextDouble();
            System.out.print("Вес (в граммах): ");
            double weight = scanner.nextDouble();

            if (Math.abs(diameter - 24) <= 2 && Math.abs(weight - 74) <= 3) {
                System.out.println("Параметры шарика соответствуют стандартам.");
            } else {
                System.out.println("Параметры шарика не соответствуют стандартам.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
