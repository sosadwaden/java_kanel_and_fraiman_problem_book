package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры трехзначное число
    и проверяет, на какое число из составляющих его цифр оно делится (без остатка).
    Следует учесть возможность того, что одной из цифр в проверяемом числе может быть и О.
 */
public class Task_9_30 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if (firstDigit != 0 && number % firstDigit == 0) {
            System.out.printf("Число %d делится на %d без остатка", number, firstDigit);
        }
        if (secondDigit != 0 && number % secondDigit == 0) {
            System.out.printf("Число %d делится на %d без остатка", number, secondDigit);
        }
        if (thirdDigit != 0 && number % thirdDigit == 0) {
            System.out.printf("Число %d делится на %d без остатка", number, thirdDigit);
        }
    }
}
