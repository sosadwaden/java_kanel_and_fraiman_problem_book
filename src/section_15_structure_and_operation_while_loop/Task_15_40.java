package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и находит его наибольший делитель, отличный от самого числа.
 */
public class Task_15_40 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = x - 1;

        while (a > 1) {
            if (x % a == 0) {
                System.out.println(a);
                break;
            }
            a--;
        }

        scanner.close();
    }
}
