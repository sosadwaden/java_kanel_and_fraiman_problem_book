package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры имя и фамилию
    одного человека, а затем имя и фамилию другого.
    Класс должен проверить, являются ли эти два человека:
    • тезками, но не однофамильцами;
    • однофамильцами, но не тезками;
    • и тезками, и однофамильцами.
    По результатам проверки следует вывести на экран соответствующее сообщение.
 */
public class Task_9_37 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию первого человека через пробел:");
        String firstName1 = scanner.next();
        String lastName1 = scanner.next();

        System.out.println("Введите имя и фамилию второго человека через пробел:");
        String firstName2 = scanner.next();
        String lastName2 = scanner.next();

        if (firstName1.equalsIgnoreCase(firstName2) && !lastName1.equalsIgnoreCase(lastName2)) {
            System.out.println("Они тезки, но не однофамильцы.");
        } else if (!firstName1.equalsIgnoreCase(firstName2) && lastName1.equalsIgnoreCase(lastName2)) {
            System.out.println("Они однофамильцы, но не тезки.");
        } else if (firstName1.equalsIgnoreCase(firstName2) && lastName1.equalsIgnoreCase(lastName2)) {
            System.out.println("Они тезки и однофамильцы.");
        } else {
            System.out.println("Они не тезки и не однофамильцы.");
        }

        scanner.close();
    }
}
