package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное число.
    Класс должен заменить его на сумму его же цифр и продолжать эту замену
    до тех пор, пока не получится однозначное число. Все получающиеся
    значения следует вывести на экран.
 */
public class Task_15_21 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number > 10) {
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            number = sum;
            System.out.println(number);
        }

        scanner.close();
    }
}
