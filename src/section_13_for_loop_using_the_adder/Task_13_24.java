package section_13_for_loop_using_the_adder;

/*
    Задание: Напишите класс, который создает серию из 20 случайных чисел из
    диапазона 30...49. Числа в серии следует вывести на экран в одну строку
    следующим образом:
    • перед значениями, которые меньше первого в серии, вывести знак «минус»;
    • перед значениями, которые больше первого в серии, вывести знак «плюс».
 */
public class Task_13_24 {

    public void action() {
        int firstNumber = (int) (Math.random() * 20) + 30;
        System.out.print(firstNumber + " ");

        for (int i = 1; i < 20; i++) {
            int randomNumber = (int) (Math.random() * 20) + 30;

            if (randomNumber > firstNumber) {
                System.out.print("+");
            } else if (randomNumber < firstNumber) {
                System.out.print("-");
            }

            System.out.print(" " + randomNumber);
        }
    }
}
