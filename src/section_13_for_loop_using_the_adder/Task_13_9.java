package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Два положительных целых числа называются «четно-близкими по
    сумме», если сумма их общих делителей является четным числом.
    Напишите класс, который принимает с клавиатуры два целых положительных
    числа и проверяет, являются ли они «четно-близкими по сумме».
 */
public class Task_13_9 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                sum += i;
            }

        }

        if (sum % 2 == 0) {
            System.out.print("Четно-близкие");
        }
        else {
            System.out.print("Нет");
        }

        scanner.close();
    }
}
