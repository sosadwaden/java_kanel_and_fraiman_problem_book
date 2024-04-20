package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры фамилию пассажира
    и город, в который он вылетает. Класс должен построить строковую переменную,
    которая будет содержать сообщение Пассажир ... вылетает в ... , в котором вместо многоточий
    будут фигурировать фамилия пассажира и название города, в который
    он вылетает. Эту строковую переменную следует вывести на экран.
 */
public class Task_2_36 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();
        String city = scanner.nextLine();

        System.out.printf("Пассажир %s вылетает в %s", surname, city);
        scanner.close();
    }
}
