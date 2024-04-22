package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
    • в первой строке - все четные (по значению) цифры этого числа, через пробел;
    • во второй строке - все нечетные (по значению) цифры этого числа, через пробел.
    Например, для числа 765873 в первой строке будет выведена серия 6 8,
    а во второй строке - 7 5 7 3.
 */
public class Task_15_23 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstPass = number;
        int secondPass = number;

        while (firstPass != 0) {
            if ((firstPass % 10) % 2 == 0) {
                System.out.print(firstPass % 10 + " ");
            }
            firstPass /= 10;
        }
        System.out.println();

        while (secondPass != 0) {
            if ((secondPass % 10) % 2 != 0) {
                System.out.print(secondPass % 10 + " ");
            }
            secondPass /= 10;
        }

        scanner.close();
    }
}
