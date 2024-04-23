package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметров целое
    число Х и цифру D. Метод возвращает значение true, если цифра D
    встречается хотя бы раз в числе Х; в ином случае метод возвращает
    значение false.
 */
public class Task_17_32 {

    public boolean method(int X, int D) {
        while (X != 0) {
            if (X % 10 == D) {
                return true;
            }

            X /= 10;
        }

        return false;
    }
}
