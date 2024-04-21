package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры следующие данные:
    • центр окружности (два действительных числа);
    • радиус окружности;
    • 15 пар координат точек на плоскости.
    Класс должен вывести на экран количество точек, лежащих внутри окружности
    и количество точек, лежащих на окружности.
 */
public class Task_12_19 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты центра окружности:");
        System.out.print("x: ");
        double centerX = scanner.nextDouble();
        System.out.print("y: ");
        double centerY = scanner.nextDouble();
        System.out.print("Введите радиус окружности: ");
        double radius = scanner.nextDouble();

        int pointsInside = 0;
        int pointsOnCircle = 0;

        System.out.println("Введите координаты 15 точек:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Точка " + (i + 1) + ": x = ");
            double x = scanner.nextDouble();
            System.out.print("         y = ");
            double y = scanner.nextDouble();

            double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));

            if (distance < radius) {
                pointsInside++;
            } else if (distance == radius) {
                pointsOnCircle++;
            }
        }

        System.out.println("Количество точек, лежащих внутри окружности: " + pointsInside);
        System.out.println("Количество точек, лежащих на окружности: " + pointsOnCircle);
        scanner.close();
    }
}
