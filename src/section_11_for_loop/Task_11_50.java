package section_11_for_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который:
    • сначала вводит с клавиатуры целое положительное двузначное
      число (нет необходимости проверять соответствие введенного значения этому условию);
    • затем выводит на экран четырехзначные целые положительные
      числа, в которых и сумма двух первых цифр, и сумма двух последних
      цифр равны сумме цифр двузначного числа, введенного с клавиатуры.
 */
public class Task_11_50 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberFirstDigit = number / 10;
        int numberLastDigit = number % 10;
        int numberDigitsSum = numberFirstDigit + numberLastDigit;

        for (int i = 1000; i < 10_000; i++) {
            int firstDigit = i / 1000;
            int secondDigit = i / 100 % 10;
            int thirdDigit = i / 10 % 10;
            int fourthDigit = i % 10;

            int sum1 = firstDigit + secondDigit;
            int sum2 = thirdDigit + fourthDigit;

            if (sum1 == numberDigitsSum && sum2 == numberDigitsSum) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
