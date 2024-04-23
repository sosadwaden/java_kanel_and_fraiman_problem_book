package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который получает следующие параметры: координаты
    центра круга, радиус круга и координаты некой точки.
    Метод должен проверить, находится ли данная точка внутри круга.
 */
public class Task_17_40 {

    public boolean method(int centerX, int centerY, int radius, int pointX, int pointY) {
        double distance = Math.sqrt(Math.pow((pointX - centerX), 2) + Math.pow((pointY - centerY), 2));
        return distance <= radius;
    }
}
