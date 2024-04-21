package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число, а затем выводит на экран все целые положительные трехзначные
    числа, сумма цифр которых равна введенному с клавиатуры значению.
 */
public class Task_11_28 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 100; i < 999; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int thirdDigit = i % 10;

            if (firstDigit + secondDigit + thirdDigit == number) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
