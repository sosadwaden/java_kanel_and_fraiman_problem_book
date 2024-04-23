package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра коэффициенты
    квадратного уравнения (а, b и с) и возвращает значение true,
    если уравнение имеет хотя бы одно решение (корень). В ином случае
    метод возвращает значение false.
 */
public class Task_17_22 {

    public boolean method(double a, double b, double c) {
        double d = (b * b) - (4 * a * c);
        return d >= 0;
    }
}
