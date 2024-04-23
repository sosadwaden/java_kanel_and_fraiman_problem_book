package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое положительное
    число n и возвращает значение факториала (n!).
 */
public class Task_17_27 {

    public long method(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
