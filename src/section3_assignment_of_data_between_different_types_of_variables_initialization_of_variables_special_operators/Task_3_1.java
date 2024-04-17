package section3_assignment_of_data_between_different_types_of_variables_initialization_of_variables_special_operators;

import java.util.Scanner;

/*
    Задание: Связь между температурой по шкале Цельсия и температурой по шкале
    Фаренгейта выражается формулой: C = 5 * (F - 32) / 9, где С - температура
    по шкале Цельсия, F - температура по шкале Фаренгейта.
    Напишите класс, который принимает с клавиатуры температуру по
    шкале Фаренгейта, а затем выводит на экран эту же температуру, но по шкале Цельсия.
 */
public class Task_3_1 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        double F = scanner.nextDouble();
        double C = 5 * (F - 32) / 9.0;

        System.out.println(C);
    }
}
