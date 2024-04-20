package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа,
    первое из которых представляет собой год рождения, а второе - нынешний
    (текущий) год. Класс должен вывести на экран возраст (в целых годах).
 */
public class Task_2_26 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth = scanner.nextInt();
        int currentYear = scanner.nextInt();

        System.out.println("Ваше текущий возраст: " + (currentYear - yearOfBirth));
        scanner.close();
    }
}
