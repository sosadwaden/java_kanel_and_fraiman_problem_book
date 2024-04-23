package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который получает в качестве параметров два целых
    числа. Метод возвращает значение true, если первая цифра в первом
    параметре равна последней цифре во втором параметре. В ином случае
    метод возвращает значение false.
 */
public class Task_17_19 {

    public boolean method(int number1, int number2) {
        int numberLength1 = String.valueOf(number1).length();
        int divider1 = (int) Math.pow(10, numberLength1 - 1);
        int firstDigit1 = number1 / divider1;

        return firstDigit1 == number2 % 10;
    }

}
