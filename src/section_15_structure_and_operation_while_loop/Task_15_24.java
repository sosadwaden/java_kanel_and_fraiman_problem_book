package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
    • в первой строке - все четные (по месту) цифры этого числа, через пробел;
    • во второй строке - все нечетные (по месту) цифры этого числа, через пробел.
    Например, для числа 765873 в первой строке будет выведена серия 6 8 3,
    а во второй строке - 7 5 7.
 */
public class Task_15_24 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstPass = number;
        int secondPass = number;
        int position1 = Integer.toString(number).length();
        int position2 = position1;

        while (firstPass != 0) {
            if (position1 % 2 == 0) {
                System.out.print(firstPass % 10 + " ");
            }
            position1--;
            firstPass /= 10;
        }
        System.out.println();

        while (secondPass != 0) {
            if (position2 % 2 != 0) {
                System.out.print(secondPass % 10 + " ");
            }
            position2--;
            secondPass /= 10;
        }

        scanner.close();
    }
}
