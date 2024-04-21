package section_12_for_loop_using_the_counter;

/*
    Задание: Определим как «красивое» целое положительное трехзначное число Х,
    для которого выполняется следующее условие: сумма квадратов первой
    и последней цифр равна квадрату средней цифры.
    Напишите класс, который выводит на экран все «красивые» числа и их количество.
 */
public class Task_12_9 {

    public void action() {
        int count = 0;

        for (int i = 100; i <= 999; i++) {
            int firstDigit = i/ 100;
            int secondDigit = i / 10 % 10;
            int thirdDigit = i % 10;

            if ((firstDigit * firstDigit + thirdDigit * thirdDigit) == secondDigit * secondDigit) {
                count++;
                System.out.print(i +" ");
            }

            System.out.println();
        }
        System.out.print(count);
    }
}
