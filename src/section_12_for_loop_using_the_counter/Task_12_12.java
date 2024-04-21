package section_12_for_loop_using_the_counter;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает для каждого из 1234 учеников
    района дату его рождения (день, месяц, год). Класс должен подсчитать
    и вывести на экран число детей, родившихся зимой, весной, летом и осенью.
 */
public class Task_12_12 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int winterCount = 0, springCount = 0, summerCount = 0, autumnCount = 0;

        for (int i = 1; i <= 1234; i++) {
            System.out.println("Введите день рождения " + i + " ученика:");
            int day = scanner.nextInt();

            System.out.println("Введите месяц рождения " + i + " ученика:");
            int month = scanner.nextInt();

            System.out.println("Введите год рождения " + i + " ученика:");
            int year = scanner.nextInt();

            if (month == 12 || month == 1 || month == 2) {
                winterCount++;
            } else if (month >= 3 && month <= 5) {
                springCount++;
            } else if (month >= 6 && month <= 8) {
                summerCount++;
            } else if (month >= 9 && month <= 11) {
                autumnCount++;
            } else {
                System.out.println("Ошибка");
            }
        }

        System.out.println("Зимой родилось " + winterCount + " учеников");
        System.out.println("Весной родилось " + springCount + " учеников");
        System.out.println("Летом родилось " + summerCount + " учеников");
        System.out.println("Осенью родилось " + autumnCount + " учеников");
        scanner.close();
    }
}
