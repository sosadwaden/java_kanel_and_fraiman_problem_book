package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры четырехзначное
    число, которое должно определять некоторый год в период с 16 по 20 века включительно.
    Класс должен вывести на экран либо сообщение, к которому веку из
    указанного диапазона относится введенное значение, либо текстовое
    сообщение, что введенное значение не является одним из годов из указанного диапазона.
 */
public class Task_9_31 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number / 100 >= 15 && number / 100 <= 19){
            System.out.println(number / 100 + 1 + "-й век.");
        } else {
            System.out.println("Нет.");
        }

        scanner.close();
    }
}
