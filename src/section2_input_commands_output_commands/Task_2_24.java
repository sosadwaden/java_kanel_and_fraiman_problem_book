package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа,
    каждое из которых представляет собой размер одной из сторон прямоугольника
    и выводит на экран следующие значения (каждое в отдельной
    строке): площадь прямоугольника и его периметр.
 */
public class Task_2_24 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("S = " + (a * b));
        System.out.println("P = " + (a + b) * 2);
    }
}
