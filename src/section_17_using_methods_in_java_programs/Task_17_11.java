package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое число
    и возвращает количество цифр в этом числе.
 */
public class Task_17_11 {

    public int method(int number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
