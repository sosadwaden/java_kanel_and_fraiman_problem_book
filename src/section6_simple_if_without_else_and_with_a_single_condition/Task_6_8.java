package section6_simple_if_without_else_and_with_a_single_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа и,
    если первое больше второго, выводит на экран их сумму, если же наоборот -
    выводит на экран их произведение. В случае же, если числа
    одинаковы, программа выводит на экран сообщение Числа равны.
 */
public class Task_6_8 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) System.out.println(number1 + number2);
        if (number1 < number2) System.out.println(number1 * number2);
        if (number1 == number2) System.out.println("Числа равны");
    }
}
