package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое число
    и возвращает самую большую цифру в этом числе.
 */
public class Task_17_12 {

    public int method(int number) {
        int maxDigit = 0;

        while (number != 0) {
            if (number % 10 > maxDigit) {
                maxDigit = number % 10;
            }
            number /= 10;
        }

        return maxDigit;
    }
}
