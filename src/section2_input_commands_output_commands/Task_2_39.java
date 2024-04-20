package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры фамилию, имя и
    отчество, а затем строит строковое значение по следующему правилу:
    первая буква имени, точка, первая буква отчества, точка, пробел, фамилия.
    Затем это строковое значение следует вывести на экран.
    Например, если с клавиатуры были введены значения
    Иван
    Иванович
    Иванов,
    то на экран следует вывести значение И. И. Иванов.
 */
public class Task_2_39 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();
        String name = scanner.nextLine();
        String patronymic = scanner.nextLine();

        char charName = name.charAt(0);
        char charPatronymic = patronymic.charAt(0);
        String message = charName + "." + charPatronymic + ". " + surname;
        System.out.println(message);
        scanner.close();
    }
}
