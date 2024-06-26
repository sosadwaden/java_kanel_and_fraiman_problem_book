package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два числа, которые
    должны быть значениями двух углов в треугольнике. Класс должен определять,
    о каком из следующих типов треугольников идет речь: остроугольный,
    тупоугольный, прямоугольный, равнобедренный, равносторонний
    (возможно, что треугольник относится сразу к двум типам).
    В случае если введенные с клавиатуры данные (или хотя бы одно из
    них) не могут быть углами треугольника, следует вывести на экран сообщение Ошибочные данные.
 */
public class Task_9_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение первого угла треугольника: ");
        int angle1 = scanner.nextInt();

        System.out.print("Введите значение второго угла треугольника: ");
        int angle2 = scanner.nextInt();

        // Проверяем, что введенные значения могут быть углами треугольника
        if ((angle1 > 0 && angle1 < 180) && (angle2 > 0 && angle2 < 180) && angle1 + angle2 < 180) {

            if (angle1 == 90 || angle2 == 90 || angle1 + angle2 == 90) {
                System.out.println("Треугольник прямоугольный.");
            }
            if (angle1 < 90 && angle2 < 90) {
                System.out.println("Треугольник остроугольный.");
            }
            if (angle1 > 90 || angle2 > 90) {
                System.out.println("Треугольник тупоугольный.");
            }
            if (angle1 == angle2) {
                System.out.println("Треугольник равнобедренный.");
            }
            if (angle1 == angle2 && angle1 == 60) {
                System.out.println("Треугольник равносторонний.");
            }
        } else {
            System.out.println("Ошибочные данные. Введены некорректные углы для треугольника.");
        }

        scanner.close();
    }
}
