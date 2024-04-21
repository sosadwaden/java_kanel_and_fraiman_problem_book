package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Для того чтобы определить, сколько учеников готовы поехать на экскурсию,
    в школе провели опрос. Каждый из 200 учеников отметил в опроснике:
    «1»- если он готов поехать на экскурсию, «0» - если не готов.
    Напишите класс, который принимает с клавиатуры ответы учеников и
    определяет количество учеников, готовых поехать на экскурсию. Кроме
    того, класс должен определить, поедет ли на экскурсию большинство
    участвовавших в опросе учеников или нет.
 */
public class Task_12_11 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int count0 = 0, count1 = 0;

        for (int i = 0; i < 200; i++) {
            int c = scanner.nextInt();

            if (c == 0) {
                count0++;
            }
            if (c == 1) {
                count1++;
            }
        }

        if (count1 > count0) {
            System.out.print("Экскурсия состоится");
        } else {
            System.out.println("Экскурсия не состоится");
        }

        scanner.close();
    }
}
