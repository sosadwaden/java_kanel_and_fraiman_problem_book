package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое число
    и возвращает значение true, если оно - симметричное (палиндром -
    как, например, число 53477435); в ином случае метод возвращает значение false.
 */
public class Task_17_35 {

    public boolean method(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
