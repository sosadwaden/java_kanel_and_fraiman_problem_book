package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Определим следующие периоды в течение суток: утро - с 6 (включая)
    до 10 (не включая) часов, день - с 10 (не включая) до 18 (включая}, вечер -
    с 18 (не включая) до 22 (включая}, ночь - с 22 (не включая) до
    6 часов следующего дня (не включая).
    Напишите класс, который принимает с клавиатуры целое число, которое
    должно указывать на определенный час в сутках, и выводит на экран
    сообщение, к какому периоду в сутках этот час относится. В случае
    если введенное значение не позволяет выполнить указанное действие,
    следует вывести на экран соответствующее текстовое сообщение.
 */
public class Task_9_16 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0 || number > 24) {
            System.out.println("Ошибка");
        }
        if (number >= 6 && number < 10) {
            System.out.println("Утро");
        }
        if (number > 10 && number <= 18) {
            System.out.println("День");
        }
        if (number > 18 && number <= 22) {
            System.out.println("Вечер");
        }
        if ((number > 22 && number <= 24) || (number >= 0 && number < 6)){
            System.out.println("Ночь");
        }
    }
}
