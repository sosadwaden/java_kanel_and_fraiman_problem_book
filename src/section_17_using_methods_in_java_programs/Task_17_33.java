package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметров целое
    число Х и цифру D. Метод возвращает количество цифр D в числе Х.
    Например, для числа 765672 и цифры 7 метод возвращает значение 2.
 */
public class Task_17_33 {

    public int method(int X, int D) {
        int count = 0;

        while (X != 0) {
            if (X % 10 == D) {
                count++;
            }

            X /= 10;
        }

        return count;
    }
}
