package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра два целых
    числа и возвращает среднее арифметическое сумм цифр в этих числах.
 */
public class Task_17_14 {

    public double method(int number1, int number2) {
        int digitsNumberCount = 0;
        int sumNumber = 0;

        while (number1 != 0) {
            sumNumber += number1 % 10;
            number1 /= 10;
            digitsNumberCount++;
        }

        while (number2 != 0) {
            sumNumber += number2 % 10;
            number2 /= 10;
            digitsNumberCount++;
        }

        return (double) sumNumber / digitsNumberCount;
    }
}
