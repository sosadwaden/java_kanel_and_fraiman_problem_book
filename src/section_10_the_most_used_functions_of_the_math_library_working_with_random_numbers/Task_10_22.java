package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Отрезок в прямоугольной (декартовой) системе координат задается
    двумя парами чисел: xl, y1 определяют положение (координаты) начала
    отрезка (точка А), а х2, у2 определяют положение (координаты) конца отрезка (точка В).
    Напишите класс, который генерирует и выводит на экран две пары
    случайных целых числа из диапазона от -30 до +30: первая пара - координаты
    точки А, вторая - координаты точки В.
    Класс должен определить (и вывести на экран соответствующую информацию):
    • длину отрезка;
    • округленную длину отрезка (но не больше истинного!);
    • угол (в градусах), который образует отрезок с осью Х;
    • какую ось пересекает отрезок, и пересекает ли он какую-либо ось вообще.
 */
public class Task_10_22 {

    public void action() {
        int x1 = (int) (Math.random() * 61) - 30;
        int y1 = (int) (Math.random() * 61) - 30;

        int x2 = (int) (Math.random() * 61) - 30;
        int y2 = (int) (Math.random() * 61) - 30;

        System.out.println("Координаты точки A: (" + x1 + ", " + y1 + ")");
        System.out.println("Координаты точки B: (" + x2 + ", " + y2 + ")");

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Длина отрезка: " + length);

        int roundedLength = (int) Math.round(length);
        System.out.println("Округленная длина отрезка: " + roundedLength);

        double angle = Math.toDegrees(Math.atan2((y2 - y1), (x2 - x1)));
        System.out.println("Угол с осью X: " + angle + " градусов");

        String axis = "";
        if (x1 == x2 && y1 == y2) {
            axis = "Отрезок вырожден и не пересекает никакую ось";
        } else if (x1 == x2) {
            axis = "Отрезок параллелен оси Y";
        } else if (y1 == y2) {
            axis = "Отрезок параллелен оси X";
        } else {
            axis = "Отрезок не параллелен ни одной из осей";
        }

        System.out.println(axis);
    }
}
