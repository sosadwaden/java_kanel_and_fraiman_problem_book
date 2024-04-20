package section_9_if_statement_with_a_complex_condition;

import java.util.Scanner;

/*
    Задание: На каждом этаже многоэтажного дома расположены три квартиры;
    счет квартир идет слева направо. Например, на первом этаже квартира
    № 1 расположена слева, квартира № 2 - в центре, квартира № 3 - справа, и так далее.
    Напишите класс, который принимает с клавиатуры номер квартиры и выводит
    на экран следующую информацию: на каком этаже она расположена,
    и какое место (слева, справа или в центре) она занимает на этом этаже.
 */
public class Task_9_5 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int level = number / 3 + 1;

        if (number % 3 == 0) {
            System.out.println("Справа, " + "Этаж: " + level);
        }
        if (number % 3 == 1) {
            System.out.println("Слева, " + "Этаж: " + level);
        }
        if (number % 3 == 2) {
            System.out.println("В центре, " + "Этаж: " + level);
        }

        scanner.close();
    }
}
