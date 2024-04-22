package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число и находит его наименьший делитель, отличный от 1.
 */
public class Task_15_39 {

    public void action() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int a = 2;

        while (a <= x ) {
            if (x % a == 0) {
                System.out.print(a);
                break;
            }
            a++;
        }

        scanner.close();
    }
}
