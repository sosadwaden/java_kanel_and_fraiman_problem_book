package section8_simple_if_with_block;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два числа: первое -
    количество учеников в классе, второе - количество стульев в классной комнате.
    Программа проверит соответствие между этими двумя значениями и
    выведет на экран соответствующую информацию (например, для значений
    35 и 39 на экран выводится 4 стула лишних).
 */
public class Task_8_11 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        int numberOfChairs = scanner.nextInt();

        if (numberOfChairs >= numberOfStudents) {
            System.out.println("Стульев хватит всем");
        } else {
            System.out.println("Количество недостающих стульев: " + (numberOfStudents - numberOfChairs));
        }
    }
}
