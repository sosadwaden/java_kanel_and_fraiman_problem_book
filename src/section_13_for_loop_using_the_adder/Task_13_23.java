package section_13_for_loop_using_the_adder;

/*
    Задание: Напишите класс, который выводит на экран все двузначные числа, у
    которых удвоенная сумма цифр равна их произведению.
    Класс также должен подсчитывать (и выводить на экран с соответствующим
    текстовым сообщением) количество и сумму этих чисел.
 */
public class Task_13_23 {

    public void action() {
        int sum = 0;
        int count = 0;

        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;

            if ((firstDigit + secondDigit) * 2 == firstDigit * secondDigit) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }

        System.out.println("\nКоличество таких чисел: " + count);
        System.out.println("Сумма этих чисел: " + sum);
    }
}
