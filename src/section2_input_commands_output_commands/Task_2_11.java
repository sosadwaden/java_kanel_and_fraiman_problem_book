package section2_input_commands_output_commands;

/*
    Задание: Напишите класс, который выводит на экран в одной строке ваше имя и
    фамилию, в друтой - телефон, все это - в рамке из «звездочек» ().
    Например:
    Иван Иванов
    7-841-266666
 */
public class Task_2_11 {

    public void action() {
        String name = "Иван", surname = "Иванов", phoneNumber = "7-841-2666666";

        System.out.println("*****************");
        System.out.println("* " + name + "  " + surname + "  *");
        System.out.println("* " + phoneNumber + " *");
        System.out.println("*****************");
    }
}
