package section_13_for_loop_using_the_adder;

/*
    Задание: Напишите класс, который создает серию из 25 случайных чисел из
    диапазона 10...99.
    Класс будет выводить на экран только те числа серии, которые делятся
    без остатка на первое число в серии.
 */
public class Task_13_25 {

    public void action() {
        int firstNumber = (int) (Math.random() * 90) + 10;
        System.out.println("Первое число в серии: " + firstNumber);

        for (int i = 0; i < 24; i++) {
            int randomNumber = (int) (Math.random() * 90) + 10;

            if (randomNumber % firstNumber == 0) {
                System.out.print(randomNumber + " ");
            }
        }
    }
}
