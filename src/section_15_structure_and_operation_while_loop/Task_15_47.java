package section_15_structure_and_operation_while_loop;

import java.util.Scanner;

/*
    Задание: На спектакль в кассу театра было выделено определенное количество
    билетов, и продажа осуществлялась до тех пор, пока не были проданы все билеты.
    Напишите класс, который сначала принимает с клавиатуры количество
    билетов, переданных в кассу. Затем класс принимает с клавиатуры серию
    чисел, каждое из которых указывает на число билетов, которое
    желает приобрести очередной покупатель.
    Если нет возможности продать очередному покупателю требуемое им
    число билетов, принимается заказ от следующего покупателя.
    Класс должен вывести на экран следующую итоговую информацию:
    • какое число покупателей приобрели билеты;
    • какому числу покупателей было отказано в продаже билетов.
 */
public class Task_15_47 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите общее количество билетов: ");
        int totalTickets = scanner.nextInt();
        int soldTickets = 0;
        int rejectedBuyers = 0;

        while (totalTickets > 0) {
            System.out.print("Сколько билетов желает приобрести покупатель? ");
            int ticketsToBuy = scanner.nextInt();

            if (ticketsToBuy <= totalTickets) {
                soldTickets += ticketsToBuy;
                totalTickets -= ticketsToBuy;
            } else {
                rejectedBuyers++;
            }
        }

        System.out.println("Число покупателей, купивших билеты: " + soldTickets);
        System.out.println("Число покупателей, которым отказано в продаже билетов: " + rejectedBuyers);
        scanner.close();
    }
}
