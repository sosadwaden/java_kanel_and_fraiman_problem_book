package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра число и возвращает:
    • -1 - в случае если число отрицательное;
    • 0 - в случае если число равно 0;
    • 1 - в случае если число положительное.
 */
public class Task_17_8 {

    public int method(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 0;
        }

        return 1;
    }
}
