package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два строковых значения:
    ваше имя и вашу фамилию.
    Класс должен вывести на экран сообщение Вас зовут, а рядом с ним
    (через пробел) ваше имя и фамилию, введенные с клавиатуры.
 */
public class Task_2_35 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();

        System.out.printf("Вас зовут %s %s", name, surname);
    }
}
