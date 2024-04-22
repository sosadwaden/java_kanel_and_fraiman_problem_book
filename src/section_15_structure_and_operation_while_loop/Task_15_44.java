package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Наибольший общий делитель (НОД) двух целых положительных чисел
    можно определить по алгоритму Евклида: НОД чисел а, Ь равен
    НОД меньшего из чисел и остатка от деления большего числа на меньшее.
    Напишите класс, который принимает с клавиатуры два целых положительных
    числа и определяет их НОД описанным методом.
 */
public class Task_15_44 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("Наибольший общий делитель: " + a);
        scanner.close();
    }
}
