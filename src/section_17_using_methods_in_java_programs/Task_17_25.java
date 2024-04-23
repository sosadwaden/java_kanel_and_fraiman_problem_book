package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое положительное
    число N. Метод возвращает количество простых чисел,
    находящихся в диапазоне 1...N.
 */
public class Task_17_25 {

    public int method(int N) {
        int count = 0;

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
