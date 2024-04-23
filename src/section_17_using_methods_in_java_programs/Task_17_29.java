package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое положительное
    число N. Метод возвращает общее количество делителей
    для всех чисел из диапазона N...2N.
 */
public class Task_17_29 {

    public int method(int N) {
        int count = 0;
        for (int i = N; N <= N * 2; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
