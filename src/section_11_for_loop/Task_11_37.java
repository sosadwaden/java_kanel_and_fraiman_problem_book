package section_11_for_loop;

/*
    Задание: Напишите класс, который генерирует 20 случайных чисел из диапазона от -18 до 18.
    Для каждого отрицательного числа следует вывести на экран само
    число и его квадрат (в одной строке), для положительного - само
    число и округленный (по правилам округления, принятым в математике)
    корень из числа. Значения, равные нулю, не выводятся на экран вообще.
 */
public class Task_11_37 {

    public void action() {
        for (int i = 0; i < 20; i++) {
            int number = (int) (Math.random() * 37) - 18;

            if (number != 0) {
                if (number < 0) {
                    System.out.println(number + " " + (number * number));
                } else {
                    System.out.println(number + " " + Math.round(Math.sqrt(number)));
                }
            }
        }
    }
}
