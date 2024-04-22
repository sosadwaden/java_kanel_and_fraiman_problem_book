package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры число для переменной
    Х, а затем дополнительную серию чисел, каждое из которых
    используется для уменьшения значения переменной Х. Ввод чисел
    должен производиться до тех пор, пока значение переменной Х остается положительным.
 */
public class Task_15_10 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        while (x > 0) {
            int a = scanner.nextInt();
            x -= a;
        }

        scanner.close();
    }
}
