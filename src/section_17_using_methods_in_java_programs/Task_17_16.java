package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который получает в качестве параметра целое положительное
    число. Метод возвращает крайнюю левую цифру числа.
 */
public class Task_17_16 {

    public int method(int number) {
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            number /= 10;
        }

        return digit;
    }
}
