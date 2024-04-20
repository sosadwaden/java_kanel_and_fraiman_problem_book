package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два положительных
    числа - двузначное и четырехзначное - и проверяет, сколько раз двузначное
    число фигурирует как «внутреннее» по отношению к четырехзначному.
 */
public class Task_9_27 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int doubleDigitsNumber = scanner.nextInt();
        int fourDigitsNumber = scanner.nextInt();

        int count = 0;
        int firstCouple = fourDigitsNumber / 100;
        int secondCouple = fourDigitsNumber / 10 % 100;
        int thirdCouple = fourDigitsNumber % 100;

        if (doubleDigitsNumber == firstCouple) {
            count++;
        }
        if (doubleDigitsNumber == secondCouple) {
            count++;
        }
        if (doubleDigitsNumber == thirdCouple) {
            count++;
        }

        System.out.println(count);
        scanner.close();
    }
}
