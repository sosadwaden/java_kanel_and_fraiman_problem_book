package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число (для
    переменной х) и выводит на экран серию значений: х, х2 , х3...х^n до тех
    пор, пока очередное значение остается меньше 1000.
 */
public class Task_15_33 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        while (x < 1000) {
            System.out.println(x);
            x *= x;
        }

        scanner.close();
    }
}
