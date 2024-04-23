package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое положительное
    число n и выводит на экран значения факториалов всех чисел меньших n.
 */
public class Task_17_28 {

    public static void method(int n) {
        for (int i = 1; i < n; i++) {
            long factorial = factorial(i);
            System.out.println("Факториал числа " + i + " равен: " + factorial);
        }
    }

    public static long factorial(int n) {
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
