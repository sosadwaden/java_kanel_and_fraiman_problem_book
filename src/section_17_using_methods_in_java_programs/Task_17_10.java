package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметров целое
    число и возвращает сумму его цифр.
 */
public class Task_17_10 {

    public int method(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
