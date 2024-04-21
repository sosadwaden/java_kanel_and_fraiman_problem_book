package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Назовем «степенью родства» двух целых положительных чисел количество
    их общих делителей. Напишите класс, который принимает с клавиатуры два целых положительных
    числа и определяет их «степень родства».
 */
public class Task_12_18 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int degreeOfKinship = 0;

        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                degreeOfKinship++;
            }
        }

        System.out.printf("Степень родства чисел %d и %d: %d", number1, number2, degreeOfKinship);
        scanner.close();
    }
}
