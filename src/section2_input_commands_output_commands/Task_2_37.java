package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры имя и фамилию ученика.
    Класс должен вывести на экран в одной строке сначала фамилию, а
    после нее имя ученика, а во второй строке - сначала имя, а после него - фамилию ученика.
 */
public class Task_2_37 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();

        System.out.printf("%s %s%n", surname, name);
        System.out.printf("%s %s%n", name, surname);
        scanner.close();
    }
}
