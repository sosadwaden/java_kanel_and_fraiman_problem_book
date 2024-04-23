package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите класс, который принимает в качестве параметра целое положительное
    число К. Метод выводит на экран все простые двузначные
    числа, разница между которыми равна К.
 */
public class Task_17_26 {

    public static void method(int K) {
        for (int i = 10; i <= 99 - K; i++) {
            if (isPrime(i) && isPrime(i + K)) {
                System.out.println(i + " и " + (i + K));
            }
        }
    }

    public static boolean isPrime(int num) {
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
