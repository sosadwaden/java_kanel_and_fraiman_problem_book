package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который должен принимать с клавиатуры серию возрастающих по значению
    целых чисел. Класс должен выводить на экран количество значений в серии - за
    исключением последнего введенного с клавиатуры значения.
 */
public class Task_15_13 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int count = 1;

        while (a > x) {
            count++;
            x = a;
            a = scanner.nextInt();
        }

        System.out.println(count);
        scanner.close();
    }
}
