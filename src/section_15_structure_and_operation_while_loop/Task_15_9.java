package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число, а затем
    выводит на экран последующие ему целые числа, пока сумма этих
    чисел не превышает квадрата введенного числа.
 */
public class Task_15_9 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int a = number + 1;

        while (true) {
            System.out.print(a + " ");
            sum += a;

            if (sum >= number * number) {
                break;
            }

            a++;
        }

        scanner.close();
    }
}
