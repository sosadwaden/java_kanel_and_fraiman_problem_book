package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры временной интервал,
    выраженный в секундах, и выводит на экран тот же интервал, но
    выраженный в часах, минутах и секундах.
    Если промежуток времени превышает сутки, то надо не производить
    пересчет, а просто вывести на экран текстовое сообщение Расчет не производится.
 */
public class Task_9_21 {

    public void action(){
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int min = sec / 60;
        int hour = min / 60;

        if (sec >= 86_400) {
            System.out.println("Расчет не производится");
        } else {
            sec -= min * 60;
            min -= hour * 60;
            System.out.printf("Часов: %d, Минут: %d, Секунд: %d", hour, min, sec);
        }

        scanner.close();
    }
}
