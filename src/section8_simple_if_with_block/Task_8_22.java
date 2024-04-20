package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и изменяет его следующим образом:
    • для четного числа - увеличивает его до ближайшего «круглого» и
      выводит новое значение на экран вместе с сообщением Up to."
    • для нечетного числа - уменьшает его до ближайшего «круглого» и
      выводит новое значение на экран вместе с сообщением Down to".
    Например, для введенного значения 433 на экран выводится Down to
    430, а для 56 выводится Up to 60.
 */
public class Task_8_22 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int newNumber;

        if (number % 2 == 0) {
            newNumber = (number / 10 + 1) * 10;
            System.out.println("Up to " + newNumber);
        } else {
            newNumber = (number / 10) * 10;
            System.out.println("Down to " + newNumber);
        }

        scanner.close();
    }
}
