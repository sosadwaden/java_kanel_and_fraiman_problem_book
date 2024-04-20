package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который выполняет следующие действия:
    1. Принимает с клавиатуры два целых числа.
    2. Создает и выводит на экран 20 случайных чисел в диапазоне от
    первого, только что введенного с клавиатуры, значения, - до второго
    значения, также введенного с клавиатуры перед этим. Можно
    исходить из предположения, что первое из вводимых чисел всегда меньше второго.
    Например, если с клавиатуры были введены значения -8 и 17, то класс
    создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти значения).
 */
public class Task_11_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("20 случайных чисел в диапазоне от " + firstNumber + " до " + secondNumber + ":");

        for (int i = 0; i < 20; i++) {
            int randomNumber = (int) (Math.random() * (secondNumber - firstNumber + 1) + firstNumber);
            System.out.print(randomNumber + " ");
        }

        scanner.close();
    }
}
