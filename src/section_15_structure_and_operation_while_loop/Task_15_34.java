package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число х. Класс должен определить наибольшее значение в серии
    1^2 + 2^2 + 3^2+..., сумма которой не превышает x.
 */
public class Task_15_34 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int sum = 0;
        int number = 1;

        while (sum + (number * number) <= x) {
            sum += number * number;
            number++;
        }

        System.out.println("Наибольшее значение в серии, сумма которой не превышает " + x + ", равно " + (number - 1));
        scanner.close();
    }
}
