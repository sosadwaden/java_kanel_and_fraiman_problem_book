package section_13_for_loop_using_the_adder;

import java.util.Scanner;

/*
    Задание: Для вычисления числа π используется формула Эйлера: π^2 / 6 равно сумме ряда
    1/1^2 + 1/2^2 + 1/3^2 + 1/4^2 +....
    Напишите класс, который принимает с клавиатуры число слагаемых в ряду Эйлера
    и вычисляет значение числа π.
 */
public class Task_13_32 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слагаемых в ряду Эйлера: ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }

        double pi = Math.sqrt(sum * 6);
        System.out.println("Значение числа π: " + pi);
        scanner.close();
    }
}
