package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и подсчитывает
    число цифр в нем (количество цифр в числе).
    Результат подсчета должен быть выведен на экран. Например, для числа
    534 на экран будет выведено 3 цифры.
 */
public class Task_15_28 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOfDigits = Integer.toString(number).length();

        System.out.println("Количество цифр в числе: " + numberOfDigits);
        scanner.close();
    }
}
