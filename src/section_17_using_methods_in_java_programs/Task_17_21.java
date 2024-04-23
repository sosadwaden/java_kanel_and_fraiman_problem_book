package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметров координаты
    точки на плоскости (Х и У) и возвращает расстояние между этой
    точкой и началом координат.
 */
public class Task_17_21 {

    public double method(int X, int Y) {
        return Math.sqrt(X * X + Y * Y);
    }
}
