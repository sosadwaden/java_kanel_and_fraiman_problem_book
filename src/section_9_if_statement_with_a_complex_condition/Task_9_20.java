package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры промежуток времени,
    выраженный в секундах, и выводит на экран его же, но выраженный в минутах и секундах.
    Если промежуток времени превышает час, то надо не производить пересчет,
    а просто вывести на экран текстовое сообщение Расчет не производится.
 */
public class Task_9_20 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int min = sec / 60;

        if (sec >= 3600) {
            System.out.println("Расчет не производится");
        } else {
            sec -= min * 60;
            System.out.printf("Минут: %d, Секунд: %d", min, sec);
        }
    }
}
