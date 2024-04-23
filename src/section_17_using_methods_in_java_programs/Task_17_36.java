package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое число
    и проверяет, каких цифр в нем больше - четных или нечетных (по
    значению). В случае если больше четных - метод возвращает 1, если
    больше нечетных - метод возвращает -1, в случае равенства количества
    четных и нечетных цифр - метод возвращает 0.
 */
public class Task_17_36 {

    public int method(int number) {
        int evenCount = 0;
        int oddCount = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }

        if (evenCount > oddCount) {
            return 1;
        } else if (oddCount > evenCount) {
            return -1;
        }

        return 0;
    }
}
