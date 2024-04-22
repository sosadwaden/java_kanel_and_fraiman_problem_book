package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое положительное
    число х. Класс должен найти наименьшее целое положительное
    двузначное число, сумма цифр которого равна х.
    Если такого двузначного числа не существует, следует вывести на экран
    соответствующее текстовое сообщение.
 */
public class Task_15_37 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = 10;
        int n = -1;
        boolean exists = false;

        while (a < 100) {
            int firstDigit = a / 10;
            int secondDigit = a % 10;

            if (firstDigit + secondDigit == x) {
                n = a;
                exists = true;
                break;
            }
            a++;
        }

        if (exists) {
            System.out.println("Такое число существует: " + n);
        } else {
            System.out.println("Такое число не существует");
        }

        scanner.close();
    }
}
