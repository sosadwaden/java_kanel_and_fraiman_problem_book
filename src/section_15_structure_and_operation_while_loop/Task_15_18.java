package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран все числа, которые можно получить из введенного за
    счет «стирания последней цифры». Например, для введенного числа
    52435 будут выведены на экран 5243, 524, 52, 5, 0.
 */
public class Task_15_18 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number != 0) {
            number /= 10;
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
