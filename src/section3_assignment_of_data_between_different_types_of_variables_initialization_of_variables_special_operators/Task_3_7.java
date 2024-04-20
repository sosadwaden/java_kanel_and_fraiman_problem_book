package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран три предыдущих ему целых числа, причем каждое - в отдельной строке.
 */
public class Task_3_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = a - 1;
        int a2 = a - 2;
        int a3 = a - 3;

        System.out.println(a1 + "\n" + a2 + "\n" + a3);
        scanner.close();
    }
}
