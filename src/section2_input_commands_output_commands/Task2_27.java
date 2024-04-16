package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число, представляющее
    собой массу тела в граммах, и выводящую на экран массу этого тела в килограммах.
 */
public class Task2_27 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int weightInGrams = scanner.nextInt();
        System.out.println("Вес в килограммах:" + (weightInGrams / 1000));
    }
}
