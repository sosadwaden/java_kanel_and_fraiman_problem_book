package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание:Напишите класс, который принимает с клавиатуры
    фамилию, имя и отчество, а затем выводит на
    экран инициалы (без пробела между инициалами).
 */
public class Task_2_38 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();
        String name = scanner.nextLine();
        String patronymic = scanner.nextLine();

        char initialName = name.charAt(0);
        char initialSurname = surname.charAt(0);
        char initialPatronymic = patronymic.charAt(0);

        System.out.printf("%c.%c.%c.", initialName, initialSurname, initialPatronymic);
        scanner.close();
    }
}
