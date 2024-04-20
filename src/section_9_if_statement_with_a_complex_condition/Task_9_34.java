package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который читает с клавиатуры два символьных значения
    и проверяет, идентичны ли они.
    По результатам проверки следует вывести на экран соответствующее сообщение.
 */
public class Task_9_34 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);

        if (char1 == char2) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

        scanner.close();
    }
}
