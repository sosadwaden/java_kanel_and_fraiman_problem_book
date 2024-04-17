package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число, представляющее
    собой расстояние в единицах, принятых на флоте - в кабельтовых.
    После этого следует вывести на экран это же расстояние в
    метрах и километрах. Известно, что 1кабельтов = 185.2 метра.
 */
public class Task_2_28 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int distanceInCables = scanner.nextInt();
        double meters = distanceInCables * 185.2;
        double kilometers = meters / 1000.0;

        System.out.printf("Distance in meters: %f%nDistance in kilometers: %f", meters, kilometers);
    }
}
