package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число, а затем выводит на экран все целые положительные двузначные
    числа, сумма цифр которых равна введенному с клавиатуры значению.
 */
public class Task_11_27 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;

            if (firstDigit + lastDigit == number) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
