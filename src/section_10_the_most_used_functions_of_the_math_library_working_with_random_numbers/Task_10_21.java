package section_10_the_most_used_functions_of_the_math_library_working_with_random_numbers;

/*
    Задание: Положение точки в прямоугольной (декартовой) системе координат
    определяется двумя числам: координатами Х и У.
    Напишите класс, который генерирует и выводит на экран два случайных
    целых числа из диапазона от -30 до +30.
    Класс должен определить (и вывести на экран соответствующую информацию):
    • в какой четверти расположена точка;
    • к какой из осей она ближе;
    • расстояние между началом координат и точкой;
    • округленное до целого (но - не больше истинного!) расстояние из предыдущего пункта;
    • угол (в градусах), который образует линия, соединяющая точку с началом координат, с осью Х.
 */
public class Task_10_21 {

    public void action() {
        int x = (int) (Math.random() * 61) - 30;
        int y = (int) (Math.random() * 61) - 30;

        System.out.println("Координаты точки: (" + x + ", " + y + ")");

        String quarter = "";
        if (x > 0 && y > 0) {
            quarter = "первой";
        } else if (x < 0 && y > 0) {
            quarter = "второй";
        } else if (x < 0 && y < 0) {
            quarter = "третьей";
        } else if (x > 0 && y < 0) {
            quarter = "четвертой";
        } else {
            quarter = "на оси";
        }
        System.out.println("Точка расположена в " + quarter + " четверти");

        String closerAxis = "";
        if (Math.abs(x) < Math.abs(y)) {
            closerAxis = "ось X";
        } else if (Math.abs(x) > Math.abs(y)) {
            closerAxis = "ось Y";
        } else {
            closerAxis = "обеим осям одинаково близко";
        }

        System.out.println("Точка ближе к " + closerAxis);

        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Расстояние между началом координат и точкой: " + distance);

        int roundedDistance = (int) Math.round(distance);
        System.out.println("Округленное расстояние: " + roundedDistance);

        double angle = Math.toDegrees(Math.atan2(y, x));
        System.out.println("Угол с осью X: " + angle + " градусов");
    }
}
