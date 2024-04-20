package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры два целых числа,
    образующих ответ на вопрос «который час?» (первое - часы, второе - минуты, например,
    15 и 42) и выводит на экран следующие значения (каждое в отдельной строке):
    сколько секунд прошло с полуночи до «данного момента» и сколько минут прошло
    за это же время, а также сколько минут осталось до полуночи.
 */
public class Task_2_30 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        System.out.println("Секунд прошло с полуночи: " + (hours * 3600 + minutes * 60));
        System.out.println("Минут прошло с полуночи: " + (hours * 60 + minutes));
        System.out.println("Минут до полуночи: " + (24 * 60 - (hours * 60 + minutes)));
        scanner.close();
    }
}
