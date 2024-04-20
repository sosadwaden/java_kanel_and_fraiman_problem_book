package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран (в одной строке) три следующих за ним целых числа так,
    чтобы разница между каждым числом и следующим за ним составляла 2.
    Например: для введенного с клавиатуры числа 6 надо вывести на экран числа 8, 10, 12.
 */
public class Task_3_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = a + 2;
        int a2 = a + 4;
        int a3 = a + 6;

        System.out.println(a1 + " " + a2 + " " + a3);
        scanner.close();
    }
}
