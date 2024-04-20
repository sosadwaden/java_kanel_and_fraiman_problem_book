package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное число, и затем:
    • в случае если введено четное число, — принимает с клавиатуры
      дробное число и выводит на экран произведение этих двух чисел;
    • в противном случае - принимает с клавиатуры целое число и выводит
      на экран сумму этих двух чисел.
 */
public class Task_8_25 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            double b = scanner.nextDouble();
            System.out.println(number * b);
        }
        else {
            int c = scanner.nextInt();
            System.out.println(number + c);
        }

        scanner.close();
    }
}
