package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Симметричным («палиндромом») называется число, которое дает одинаковое
    значение при чтении его справа налево и слева направо (например, 787).
    Напишите класс, который принимает с клавиатуры положительное число
    (не большее 99999) и проверяет, является ли это число палиндромом.
    Класс должен выводить на экран соответствующее текстовое сообщение.
 */
public class Task_8_26 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstDigit = number / 10000;
        int secondDigit = (number / 1000) % 10;
        int thirdDigit = (number / 100) % 10;
        int fourthDigit = (number / 10) % 10;
        int fifthDigit = number % 10;

        if (number < 10) {
            System.out.println("Палиндром");
        }

        if (number < 100) {

        }

        // TODO

//        if (firstDigit == fifthDigit && secondDigit == fourthDigit) {
//            System.out.println("Число является палиндромом.");
//        } else {
//            System.out.println("Число не является палиндромом.");
//        }
    }
}
