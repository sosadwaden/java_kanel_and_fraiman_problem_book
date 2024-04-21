package section_13_for_loop_using_the_adder;

/*
    Задание: Напишите класс, который генерирует серию из 20 случайных положительных
    двузначных чисел и определяет сумму значений в серии.
 */
public class Task_13_2 {

    public void action() {
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            int randomNumber = (int) (Math.random() * 90) + 10;
            sum += randomNumber;
            System.out.println(randomNumber);
        }

        System.out.println("Сумма значений в серии: " + sum);
    }
}
