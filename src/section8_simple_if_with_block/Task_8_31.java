package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры трехзначное число
    и изменяет его следующим образом:
    • для четных чисел - все четные цифры увеличиваются на 1, а нечетные
      уменьшаются на 1; в случае если это невозможно, они остаются неизменными;
    • в нечетных числах все изменения производятся «наоборот».
      Программа должна вывести на экран новое значение переменной.
 */
public class Task_8_31 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (number % 2 == 0) {
            if (firstDigit % 2 == 0) firstDigit++;
            else firstDigit--;

            if (secondDigit % 2 == 0) secondDigit++;
            else secondDigit--;

            if (thirdDigit % 2 == 0) thirdDigit++;
            else thirdDigit--;
        } else {
            if (firstDigit % 2 == 0) firstDigit--;
            else firstDigit++;

            if (secondDigit % 2 == 0) secondDigit--;
            else secondDigit++;

            if (thirdDigit % 2 == 0) thirdDigit--;
            else thirdDigit++;
        }

        int newNumber = firstDigit * 100 + secondDigit * 10 + thirdDigit;
        System.out.println(newNumber);
    }
}
