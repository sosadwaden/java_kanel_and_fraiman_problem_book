package section7_simple_if_with_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два различных числа.
    Класс должен вывести на экран эти числа в порядке возрастания -
    в одной строке, а в другой - их же, но в порядке убывания.
 */
public class Task_7_11 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(b + " " + a);
            System.out.println(a + " " + b);
        }
        if (b > a) {
            System.out.println(a + " " + b);
            System.out.println(b + " " + a);
        }

        scanner.close();
    }
}
