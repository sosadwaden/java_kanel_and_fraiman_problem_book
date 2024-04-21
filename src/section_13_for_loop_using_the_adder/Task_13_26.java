package section_13_for_loop_using_the_adder;

/*
    Задание: Напишите класс, который создает серию из 15 случайных чисел из
    диапазона -30...+30.
    Класс будет выводить на экран только те числа серии, которые имеют
    такой же знак, как и предшествующее им число (значение О считать
    положительным для данного задания).
 */
public class Task_13_26 {

    public void action() {
        int previousNumber = (int) (Math.random() * 61) - 30;
        System.out.println("Первое число в серии: " + previousNumber);

        for (int i = 0; i < 14; i++) {
            int randomNumber = (int) (Math.random() * 61) - 30;

            if ((previousNumber >= 0 && randomNumber >= 0) ||
                (previousNumber < 0 && randomNumber < 0)) {
                System.out.print(randomNumber + " ");
            }

            previousNumber = randomNumber;
        }
    }
}
