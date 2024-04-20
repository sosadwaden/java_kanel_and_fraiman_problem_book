package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Определим «текстовую форму оценки» следующим образом: 1 или 2 -
    «неудовлетворительно», 3 - «удовлетворительно», 4 - «хорошо», 5 - «ОТЛИЧНО».
    Напишите класс, который принимает с клавиатуры целое число и, если
    оно соответствует оценке, выводит на экран соответствующую
    «текстовую форму оценки». В случае если число не является оценкой, следует
    вывести на экран соответствующее текстовое сообщение.
 */
public class Task_9_14 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 1 || number > 5) {
            System.out.println("Число не является оценкой");
        }
        if (number == 1 || number == 2) {
            System.out.println("Неудовлетворительно");
        }
        if (number == 3) {
            System.out.println("Удовлетворительно");
        }
        if (number == 4) {
            System.out.println("Хорошо");
        }
        if (number == 5) {
            System.out.println("ОТЛИЧНО");
        }

        scanner.close();
    }
}
