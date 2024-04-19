package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число, которое
    должно означать порядковый номер месяца. В случае если полученное
    значение действительно соответствует порядковому номеру
    одного из месяцев, следует вывести сезон (лето, осень, зима, весна), к
    которому относится месяц.
    В случае если введенное значение не является порядковым номером месяца,
    следует вывести на экран соответствующее текстовое сообщение.
 */
public class Task_9_15 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0 || number >= 13) {
            System.out.println("Это не месяц");
        }
        if (number == 12 || number == 1 || number == 2) {
            System.out.println("Зима");
        }
        if (number >= 3 && number <= 5) {
            System.out.println("Весна");
        }
        if (number >= 6 && number <= 8) {
            System.out.println("Лето");
        }
        if (number >= 9 && number <= 11) {
            System.out.println("Осень");
        }
    }
}
