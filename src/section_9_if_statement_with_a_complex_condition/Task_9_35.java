package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который читает с клавиатуры символ и проверяет,
    является ли введенный символ буквой латинского алфавита. По результатам
    проверки следует вывести на экран соответствующее сообщение.
 */
public class Task_9_35 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);

        if ((symbol >= 'A' && symbol <= 'z')) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
