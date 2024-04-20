package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры три числа: длины
    двух катетов и гипотенузы прямоугольного треугольника, и выводит
    на экран площадь и периметр этого треугольника.
    При решении следует предусмотреть возможность того, что размеры
    сторон треугольника не выражаются целыми числами.
 */
public class Task_3_5 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double catheter1 = scanner.nextDouble();
        double catheter2 = scanner.nextDouble();
        double hypotenuse = scanner.nextDouble();
        double S = catheter1 * catheter2 / 2;
        double P = catheter1 + catheter2 + hypotenuse;

        System.out.printf("P: %f %nS: %s", P, S);
        scanner.close();
    }
}
