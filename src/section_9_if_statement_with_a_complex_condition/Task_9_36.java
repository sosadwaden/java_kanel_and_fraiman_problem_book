package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два строковых значения,
    каждое из которых содержит имя человека, и проверяет, являются
    ли эти люди тезками. По результатам проверки следует вывести
    на экран соответствующее сообщение.
 */
public class Task_9_36 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Тёзки");
        } else {
            System.out.println("Нет");
        }
    }
}
