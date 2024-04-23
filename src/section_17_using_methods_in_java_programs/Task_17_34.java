package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра положительное
    целое число и возвращает число с противоположным порядком
    цифр. Например, для параметра 123 метод возвратит 321, для параметра
    120 метод вернет 21.
 */
public class Task_17_34 {

    public int method(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
