package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает в качестве параметра целое число
    и возвращает значение true, если это число простое; в ином случае
    метод возвращает значение false.
 */
public class Task_17_15 {

    public boolean method(int number) {
        boolean flag = false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
