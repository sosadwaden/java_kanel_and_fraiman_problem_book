package section7_simple_if_with_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два числа и проверяет,
    равны они друг другу или нет.
 */
public class Task_7_6 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }
}
