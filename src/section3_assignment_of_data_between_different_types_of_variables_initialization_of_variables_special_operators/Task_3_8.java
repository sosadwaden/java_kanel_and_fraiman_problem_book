package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два значения: первое -
    длина основания равнобедренного треугольника, второе - высоту
    этого треугольника. Затем класс должен подсчитать и вывести на экран:
    • площадь этого треугольника;
    • периметр прямоугольника, сторонами которого являются основание и
      высота описанного в задаче треугольника.
 */
public class Task_3_8 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        double S = 0.5 * b * h;
        double P = 2 * (b + h);

        System.out.printf("S: %f %nP: %s", S, P);
        scanner.close();
    }
}
