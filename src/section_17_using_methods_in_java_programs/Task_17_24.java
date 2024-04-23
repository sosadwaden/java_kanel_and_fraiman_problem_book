package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметров два параметра
    линейной функции (а и b, для уравнения у = ах + b), а также координаты
    точки на плоскости (х и у). Метод возвращает значение true,
    если точка лежит на графике функции; в ином случае метод возвращает значение false.
 */
public class Task_17_24 {

    public boolean method(double x, double y, double a, double b) {
        return y == a * x + b;
    }
}
