package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры четырехзначное
    число и проверяет, означает ли оно один из високосных годов 20 века.
 */
public class Task_9_32 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ((year >= 1900 && year <= 2000) && (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }

        scanner.close();
    }
}
