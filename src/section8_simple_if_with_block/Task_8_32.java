package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число, и затем:
    • в случае если введено четное число, — принимает с клавиатуры
      дробное число и выводит на экран произведение этих двух чисел;
    • в противном случае - принимает с клавиатуры целое число и выводит на экран сумму этих двух чисел.
 */
public class Task_8_32 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            double a = scanner.nextDouble();
            System.out.println(a * number);
        }
        else {
            int a = scanner.nextInt();
            System.out.println(a + number);
        }

        scanner.close();
    }
}
