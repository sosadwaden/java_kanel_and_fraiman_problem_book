package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: Напишите класс, который должен принять с клавиатуры значение 123
    и вывести на экран сообщение Код принят.
    Класс будет снова и снова принимать с клавиатуры значения до тех
    пор, пока не будет введено значение 123. На каждое вводимое с клавиатуры
    значение, отличное от 123, класс должен выводить сообщение
    Код неверный, повторите ввод.
 */
public class Task_15_7 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();

            if (number != 123) {
                System.out.println("Код неверный, повторите ввод");
            }

            if (number == 123) {
                System.out.println("Код принят");
                break;
            }
        }

        scanner.close();
    }
}
