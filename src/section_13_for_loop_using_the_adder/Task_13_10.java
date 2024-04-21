package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Назовем «степенью близости» двух целых положительных чисел сумму их общих делителей.
    Напишите класс, который принимает с клавиатуры два целых положительных
    числа и определяет их «степень близости».
 */
public class Task_13_10 {

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

        System.out.println("Степень близости: " + sum);
        scanner.close();
    }
}
