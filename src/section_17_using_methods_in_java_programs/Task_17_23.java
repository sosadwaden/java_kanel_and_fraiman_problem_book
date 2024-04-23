package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметров коэффициенты
    квадратного уравнения (а, b и с) и возвращает количество решений этого уравнения.
 */
public class Task_17_23 {

        public int method(double a, double b, double c) {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                return 2;
            } else if (discriminant == 0) {
                return 1;
            }

            return 0;
        }
}
