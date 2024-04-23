package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который получает в качестве параметра целое число
    большее или равное 10. Метод возвращает число без его крайней левой
    цифры. Например, для параметра 1234 метод вернет 234, а для параметра 104 - 4.
 */
public class Task_17_17 {

    public int method(int number) {
        int numberLength = String.valueOf(number).length();
        int divider = (int) Math.pow(10, numberLength - 1);
        return (number % divider);
    }
}
