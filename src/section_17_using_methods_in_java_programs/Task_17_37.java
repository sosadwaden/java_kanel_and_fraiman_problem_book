package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает две пары чисел: первая - координаты
    (Х и У) точки А, вторая - координаты (Х и У) точки В. Метод
    возвращает длину отрезка АВ.
 */
public class Task_17_37 {

    public double method(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
