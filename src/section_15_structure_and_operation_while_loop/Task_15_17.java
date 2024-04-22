package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число N и цифру D. Класс должен проверить, есть ли внутри числа
    N цифра D, и вывести на экран соответствующее сообщение.
 */
public class Task_15_17 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        String msg = "Нет";

        while (N != 0) {
            int lastDigit = N % 10;
            N /= 10;

            if (lastDigit == D) {
                msg = "Да";
                break;
            }
        }

        System.out.println(msg);
        scanner.close();
    }
}
