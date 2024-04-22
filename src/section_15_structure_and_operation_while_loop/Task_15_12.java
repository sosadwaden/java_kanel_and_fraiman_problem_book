package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целые числа, пока
    не будут введены с клавиатуры друг за другом два одинаковых числа.
    Класс должен выводить на экран сумму серии - за исключением последнего
    введенного с клавиатуры значения.
 */
public class Task_15_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int previousNumber = scanner.nextInt();
        int currentNumber = scanner.nextInt();
        int sum = previousNumber;

        while (previousNumber != currentNumber) {
            sum += currentNumber;
            previousNumber = currentNumber;
            currentNumber = scanner.nextInt();
        }

        System.out.println("Сумма серии: " + sum);
        scanner.close();
    }
}
